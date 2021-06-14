package com.sisvac.model;

import com.core.model.BaseModel;

public class Endereco extends BaseModel
{
    private Integer id;
    //private String rua;
    private String numero;
    //private String bairro;
    //private String complemento;
    //private String cidade;
    //private String uf;
    //private String pais;
    private String CEP;
    
    public Endereco(){
        this.setTableName("tb_endereco");
    }
    
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer param){
        this.id = param;
    }
    
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String param){
        this.numero = param;
    }
    
    public String getCEP(){
        return this.CEP;
    }
    
    public void setCEP(String param){
        this.CEP = param;
    }
/*
    public String getRua(){
        return this.rua;
    }
    public void setRua(String param){
        this.rua = param;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String param){
        this.bairro = param;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public void setComplemento(String param){
        this.complemento = param;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String param){
        this.cidade = param;
    }
    public String getUf(){
        return this.uf;
    }
    public void setUf(String param){
        this.uf = param;
    }
    public String getPais(){
        return this.pais;
    }
    public void setPais(String param){
        this.pais = param;
    }
*/
}