package com.core.model.interfaces;

public interface IUser extends IBaseModel {
    public String getName();
    public Integer getAge();
    public void setName(String param);
    public void setAge(Integer param);
    
}
