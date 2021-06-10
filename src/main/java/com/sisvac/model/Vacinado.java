package com.sisvac.model;

import com.core.model.BaseModel;
import java.time.LocalDate;

public class Vacinado extends BaseModel
{
    private Integer id;
    private Integer id_paciente;
    private Integer id_unidade_saude;
    private LocalDate data_vacinacao;
    
    public Vacinado(){
        this.setTableName("tb_vacinado");
    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer param){
        this.id = param;
    }
    public Integer getId_paciente(){
        return this.id_paciente;
    }
    public void setId_paciente(Integer param){
        this.id_paciente = param;
    }
    public Integer getId_unidade_saude(){
        return this.id_unidade_saude;
    }
    public void setId_unidade_saude(Integer param){
        this.id_unidade_saude = param;
    }
    public LocalDate getData_vacinacao(){
        return this.data_vacinacao;
    }
    public void setData_vacinacao(LocalDate param){
        this.data_vacinacao = param;
    }
}