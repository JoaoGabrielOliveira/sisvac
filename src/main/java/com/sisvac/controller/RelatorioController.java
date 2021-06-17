/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisvac.controller;

import com.core.relatorios.Relatorio;
import com.core.relatorios.RelatorioVacinacao;

public class RelatorioController {
    private Relatorio relatorioAtual;
    private Relatorio[] relatorios;
    
    public RelatorioController(){
        this.relatorios = new Relatorio[]{
            new RelatorioVacinacao()
        };
                
    }
    
    public RelatorioController(Relatorio[] relatorios){
        this.relatorios = relatorios;
    }
    
    public String[] getTitulos(){
        String[] titulos =  new String[this.relatorios.length];
        
        for (int i = 0; i < this.relatorios.length; i++){
            titulos[i] = this.relatorios[i].getTitulo();
        }

        return titulos;
    }
    
    public Relatorio getRelatorioAtual(){
        return this.relatorioAtual;
    }
    
}
