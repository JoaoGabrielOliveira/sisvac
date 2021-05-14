package com.core.model;

import com.core.model.interfaces.IUser;

public class User extends BaseModel<IUser> implements IUser
{
    private String name;
    private Integer age;
    
    public User(){
        this.setTableName("users");
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String param){
        this.name = param;
    }
    
    @Override
    public Integer getAge(){
        return this.age;
    }
    @Override
    public void setAge(Integer param){
        this.age = param;
    }
}