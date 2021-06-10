package com.sisvac.controller;

import com.core.Service;
import com.sisvac.model.Paciente;
import java.util.List;
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
        this.nivelPrioridade = 1;
        
        this.modeloPadrao = new DefaultTableModel(new Object[]{ "id", "nome"}, 0);
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
        
        this.primeiroFila();
    }
    
    public void adicionarPacientesATabela(){
        this.listaPacientes.forEach(paciente -> {
            this.adicionarPaciente(paciente);
        });
    }
    
    private void pegarPacientes70mais(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento <= ? AND vacinado = ?", this.getAno(), false);
            this.mudarPrioridadeSeNecessario(2);
            
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarPacientesSaude(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ? AND e_saude = ? AND vacinado = ?", this.getAno(), true, false);
            this.mudarPrioridadeSeNecessario(3);
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarDemaisPacienes(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ? AND vacinado = ?", this.getAno(), false);
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }

    public void adicionarPaciente(Paciente p){
        this.modeloPadrao.addRow(new Object[]{ p.getId(), p.getNome()});
    }
    
    public void limparTabela(){
        this.modeloPadrao = new DefaultTableModel(new Object[]{ "id", "nome"}, 0);
    }
    
    public void proximoFila(){
        this.listaPacientes.remove(0);
        this.modeloPadrao.removeRow(0);
        this.pacienteAtual = this.listaPacientes.get(0);
    }
    
    public void primeiroFila(){
        this.pacienteAtual = this.listaPacientes.get(0);
    }
    
    public void confirmarVacinacao(){
        try {
            this.pacienteAtual.setVacinado(true);
            JOptionPane.showMessageDialog(null, this.pacienteAtual.getId() == null ? "Está nulo oh" : "Está normal oh");
            this.service.update(this.pacienteAtual);
            this.proximoFila();
        }
        catch (Exception ex){
            this.exibirMensagemErro(ex);
            ex.printStackTrace();
        }
    }
    
    public List<Paciente> getLista(){
        return this.listaPacientes;
    }
    
    public Paciente getPacienteAtual(){
        return this.pacienteAtual;
    }
    
    public void exibirMensagemErro(Exception e){
        JOptionPane.showMessageDialog(null,"Um erro aconteceu.\n" + e.getMessage());
    }
    
    public void mudarPrioridadeSeNecessario(Integer prioridade){
        if(this.listaPacientes.isEmpty()){
            this.nivelPrioridade = prioridade;
            this.pegarPacientes();
        }
    }
    
    public java.time.LocalDate getAno(){
            return java.time.LocalDate.now().minusYears(70);
    }
    
}
