package com.core.model;

public class User
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