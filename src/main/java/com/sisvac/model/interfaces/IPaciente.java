package com.sisvac.model.interfaces;

public interface IPaciente {
    public void setId(Integer param);
    public void setName(String param);
    public void setAge(Integer param);
    
    public Integer getId();
    public String getName();
    public Integer getAge();
}
