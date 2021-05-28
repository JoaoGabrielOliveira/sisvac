package com.sisvac.model.interfaces;

import com.core.model.IBaseModel;

public interface IUser extends IBaseModel {
    public String getName();
    public Integer getAge();
    public void setName(String param);
    public void setAge(Integer param);
    
}
