package com.sisvac.model;

import com.core.model.BaseModel;
import java.util.Date;

public class Paciente extends BaseModel
{
    private Integer id;
    private String nome;
    private Integer idEndereco;
    private Boolean eSaude;
    private Date dataNascimento;

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
    public Boolean getESaude(){
        return this.eSaude;
    }
    public void setESaude(Boolean param){
        this.eSaude = param;
    }
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    public void setDataNascimento(Date param){
        this.dataNascimento = param;
    }
}