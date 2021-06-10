package com.sisvac.controller;

import com.core.Service;
import com.sisvac.model.Paciente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class FilaController {
    public DefaultTableModel modeloPadrao;
    private final Service<Paciente> service;
    
    private List<Paciente> listaPacientes;
    private Integer nivelPrioridade;
    private Paciente pacienteAtual;
    
    public FilaController(){
        this.service = new Service(Paciente.class);
        this.service.orderBy("dt_nascimento, e_saude DESC");
        
        this.limparTabela();
        try{
            this.nivelPrioridade = 1;
            this.pegarPacientes();
            this.setPacienteAtual(0);
            this.adicionarPacientesATabela();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void pegarPacientes(){
        if(this.listaPacientes != null)
            this.listaPacientes.clear();

        switch(this.nivelPrioridade){
            case 1 -> this.pegarPacientes70mais();

            case 2 -> this.pegarPacientesSaude();

            case 3 -> this.pegarDemaisPacienes();

            default -> this.pegarDemaisPacienes();
        }
    }
    
    private void pegarPacientes70mais(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento <= ? AND vacinado = ?", this.getAno(), false);
            this.verificarPacientesPrioridade();
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarPacientesSaude(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ? AND e_saude = ? AND vacinado = ?", this.getAno(), true, false);
            this.verificarPacientesPrioridade();
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarDemaisPacienes(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ? AND e_saude = ? AND vacinado = ?", this.getAno(),false, false);
            this.verificarPacientesPrioridade();
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }

    public void confirmarVacinacao() {
        try{
            this.pacienteAtual.setVacinado(true);
            this.service.update(this.pacienteAtual, "id = ?", this.pacienteAtual.getId());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void proximoFila() {
        if(!this.listaPacientes.isEmpty()){
            this.listaPacientes.remove(0);
            this.setPacienteAtual(0);
            this.limparTabela();
            this.adicionarPacientesATabela();    
        }
        else
            this.pegarPacientes();
    }
    
    public void adicionarPacientesATabela() {
        this.listaPacientes.forEach(paciente -> {
            this.adicionarPacientesATabela(paciente);
        });
    }
    
    public void adicionarPacientesATabela(Paciente p) {
        this.modeloPadrao.addRow(new Object[]{p.getId(), p.getNome()});
    }

    public void limparTabela() {
        this.modeloPadrao = new DefaultTableModel(new Object[]{"Id", "Nome"},0);
    }
    
    public Paciente getPacienteAtual() {
        return this.pacienteAtual;
    }
    
    public void setPacienteAtual(Integer indice){
        this.pacienteAtual = this.listaPacientes.get(indice);
    }
    
    public void mudarPrioridadeSeNecessario(Integer prioridade){
        if(prioridade > 1 && prioridade < 3)
            this.nivelPrioridade = prioridade;
    }
    
    public void exibirMensagemErro(Exception e){
        JOptionPane.showMessageDialog(null,"Um erro aconteceu.\n" + e.getMessage());
    }
    
    public java.time.LocalDate getAno(){
            return java.time.LocalDate.now().minusYears(70);
    }
    
    public Integer getNivel(){
        return this.nivelPrioridade;
    }

    private void verificarPacientesPrioridade() {
        if(this.listaPacientes.isEmpty())
            JOptionPane.showMessageDialog(null, "Não há pacientes nesse nivel de prioridade\nNivel de prioridade:" + this.nivelPrioridade);
    }

    
}
