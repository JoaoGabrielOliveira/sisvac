/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisvac.model;

import com.core.model.BaseModel;

/**
 *
 * @author Joao Conceicao
 */
public class Paciente extends BaseModel implements com.sisvac.model.interfaces.IPaciente {
    public Integer id;
    public String name;
    public Integer age;
    
    public Paciente(){
        this.setTableName("Pacientes");
    }

    @Override
    public void setId(Integer param) {
        this.id = param;
    }

    @Override
    public void setName(String param) {
        this.name = param;
    }

    @Override
    public void setAge(Integer param) {
        this.age = param;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
    
}
