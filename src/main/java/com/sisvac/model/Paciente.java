    package com.sisvac.model;

import com.core.model.BaseModel;
import java.time.Instant;
import java.util.Date;

public class Paciente extends BaseModel {

    private Integer id;
    private String nome;
    //private Integer idEndereco;
    private Boolean E_SAUDE;
    private Date DT_NASCIMENTO;
    private Boolean vacinado;

    public Paciente() {
        this.setTableName("tb_paciente");

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer param) {
        this.id = param;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String param) {
        this.nome = param;
    }

    /*
    public Integer getIdEndereco(){
        return this.idEndereco;
    }
    public void setIdEndereco(Integer param){
        this.idEndereco = param;
    }*/
    public Boolean getE_SAUDE() {
        return this.E_SAUDE;
    }

    public void setE_SAUDE(Boolean param) {
        this.E_SAUDE = param;
    }

    public Date getDT_NASCIMENTO() {
        return this.DT_NASCIMENTO;
    }

    public void setDT_NASCIMENTO(Date param) {
        this.DT_NASCIMENTO = param;
    }
    
    public Boolean getVacinado() {
        return this.vacinado;
    }

    public void setVacinado(Boolean param) {
        this.vacinado = param;
    }
    
    public Integer calcularIdade(){
        java.time.LocalDate date = this.DT_NASCIMENTO.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        return java.time.LocalDate.now().getYear() - date.getYear();
    }

    
}
