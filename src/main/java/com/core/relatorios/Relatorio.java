/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.relatorios;

import javax.swing.JPanel;

/**
 *
 * @author Joao Conceicao
 */
public class Relatorio implements IRelatorio {
    public String query;
    public Object[] dados;
    public JPanel panel;

    @Override
    public void setQuery(String param) {
        this.query = param;
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    @Override
    public void setDados(Object[] dados) {
        this.dados = dados;
    }

    @Override
    public Object[] getDados() {
        return this.dados;
    }

    @Override
    public void setPainel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public JPanel getPainel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
