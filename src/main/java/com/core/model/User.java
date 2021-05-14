package com.core.model;

import com.core.model.interfaces.IUser;

public class User extends BaseModel<IUser>
{
    private String name;
    private Integer age;

    public String getName(){
        return this.name;
    }
    public void setName(String param){
        this.name = param;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer param){
        this.age = param;
    }
}