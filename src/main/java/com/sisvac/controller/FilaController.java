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
    //private Integer nivelPrioridade;
    private Paciente pacienteAtual;
    private Integer indiceLista;
    
    
    public FilaController(){
        this.service = new Service(Paciente.class);
        this.limparTabela();
        this.indiceLista = 0;
        try{
            this.listaPacientes = this.service.where("vacinado = ?", false);
            this.setPacienteAtual(indiceLista);
            this.adicionarPacientesATabela();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void pegarPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void confirmarVacinacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void proximoFila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
}
