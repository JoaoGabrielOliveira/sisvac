/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.relatorios;

import javax.swing.JPanel;
import com.core.RelatorioService;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Joao Conceicao
 */
public abstract class Relatorio implements IRelatorio {
    public String query;
    public String[] colunas;
    
    public HashMap<String, Object> dados;
    public JPanel panel;
    
    public Relatorio(){
        this.dados = new HashMap<>();
        this.construir();
        
    }
    
    public abstract void construir();
    
    public abstract void getDadosFromResultSet(java.sql.ResultSet map) throws SQLException;
    
    public void execute(){
        try {
            RelatorioService service = new RelatorioService();
            this.dados = service.execute(this, this.colunas);
        }
        catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

    @Override
    public void setQuery(String param) {
        this.query = param;
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    @Override
    public void setDados(HashMap<String, Object> dados) {
        this.dados = dados;
    }

    @Override
    public HashMap<String, Object> getDados() {
        return this.dados;
    }

    @Override
    public void setPainel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public JPanel getPainel() {
        return this.panel;
    }
}
