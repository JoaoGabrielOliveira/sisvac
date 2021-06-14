package com.sisvac.controller;

import com.core.Service;
import com.sisvac.model.Paciente;
import com.sisvac.model.Vacinado;

import java.util.List;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class FilaController {
    public DefaultTableModel modeloPadrao;
    private final Service<Paciente> service;
    private final Service<Vacinado> serviceVacinado;
    
    private List<Paciente> listaPacientes;
    private Integer nivelPrioridade;
    private Paciente pacienteAtual;
    
    public FilaController(){
        this.service = new Service(Paciente.class);
        this.serviceVacinado = new Service(Vacinado.class);

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
        
        if(this.listaPacientes.isEmpty())
            JOptionPane.showMessageDialog(null, "Fila está vazia");
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
            
            Vacinado vacinado = new Vacinado();
            
            vacinado.setId_paciente(this.pacienteAtual.getId());
            vacinado.setId_unidade_saude(LoginController.funcionarioLogado.getID_UNIDADE_SAUDE());
            vacinado.setData_vacinacao(java.time.LocalDate.now());
            
            this.serviceVacinado.create(vacinado);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void pegarPrimeiroFila(){
        if(!this.listaPacientes.isEmpty())
            this.setPacienteAtual(0);
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
        try{
            this.pacienteAtual = this.listaPacientes.get(indice);
        }
        catch(java.lang.IndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Saiu do limite\n" + ex.getMessage());
        }
    }
    
    public void mudarPrioridadeSeNecessario(Integer prioridade){
        if(prioridade >= 1 && prioridade <= 3){
            this.nivelPrioridade = prioridade;
            this.pacienteAtual = new Paciente();
        }
        
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
