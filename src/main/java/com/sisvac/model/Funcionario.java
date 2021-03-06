    package com.sisvac.model;

import com.core.model.BaseModel;
import java.util.Date;



public class Funcionario extends BaseModel
{
    private Integer id;
    private String nome;
    //private Integer idEndereco;
    private String cargo;
    private String email;
    private String senha;
    private Date DT_NASCIMENTO;
    private Integer ID_UNIDADE_SAUDE;
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Funcionario() {
        this.setTableName("tb_funcionario");

    }
    
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
    /*public Integer getIdEndereco(){
        return this.idEndereco;
    }
    public void setIdEndereco(Integer param){
        this.idEndereco = param;
    }*/
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String param){
        this.cargo = param;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String param){
        this.email = param;
    }
    public Date getDT_NASCIMENTO(){
        return this.DT_NASCIMENTO;
    }
    public void setDT_NASCIMENTO(Date param){
        this.DT_NASCIMENTO = param;
    }
    public Integer getID_UNIDADE_SAUDE(){
        return this.ID_UNIDADE_SAUDE;
    }
    public void setID_UNIDADE_SAUDE(Integer param){
        this.ID_UNIDADE_SAUDE = param;
    }
}