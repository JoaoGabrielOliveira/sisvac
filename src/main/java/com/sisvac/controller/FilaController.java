package com.sisvac.controller;

import com.core.Service;
import com.sisvac.model.Paciente;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class FilaController {
    public DefaultTableModel modeloPadrao;
    private Service<Paciente> service;
    
    private List<Paciente> listaPacientes;
    private Integer nivelPrioridade;
    private Paciente pacienteAtual;
    
    
    public FilaController(){
        this.service = new Service(Paciente.class);
        this.service.orderBy("dt_nascimento, e_saude DESC");
        this.nivelPrioridade = 1;
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
            this.listaPacientes = this.service.where("dt_nascimento <= ?", this.getAno());
            
            if(this.listaPacientes.isEmpty()){
                this.nivelPrioridade = 2;
            }
            
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarPacientesSaude(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ? AND e_saude = ?", this.getAno(), true);
            if(this.listaPacientes.isEmpty()){
                this.nivelPrioridade = 3;
            }
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }
    
    private void pegarDemaisPacienes(){
        try {
            this.listaPacientes = this.service.where("dt_nascimento > ?", 70);
        }
        catch(Exception e){ this.exibirMensagemErro(e); }
    }

    public void adicionarTabela(Paciente p){
        this.modeloPadrao.addRow(new Object[]{ p.getId(), p.getNome()});
    }
    
    public void proximoFila(){
        this.listaPacientes.remove(0);
        this.pacienteAtual = this.listaPacientes.get(0);
    }
    
    public void confirmarVacinacao(){
        try {
            this.service.update(this.pacienteAtual);
        }
        catch (Exception ex){
            this.exibirMensagemErro(ex);
        }
    }
    
    public List<Paciente> getLista(){
        return this.listaPacientes;
    }
    
    public Paciente getPacienteAtual(){
        return this.pacienteAtual;
    }
    
    public void exibirMensagemErro(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null,"Um erro aconteceu.\n" + e.getMessage());
    }
    
    public java.time.LocalDate getAno(){
            return java.time.LocalDate.now().minusYears(70);
    }
    
}
