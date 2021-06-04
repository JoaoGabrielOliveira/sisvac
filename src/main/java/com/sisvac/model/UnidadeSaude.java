/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisvac.model;

public class UnidadeSaude
{
    private Integer id;
    private String nome;
    private Integer idEndereco;

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer param){
        this.id = param;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String param){
        this.nome = param;
    }
    public Integer getIdEndereco(){
        return this.idEndereco;
    }
    public void setIdEndereco(Integer param){
        this.idEndereco = param;
    }
}