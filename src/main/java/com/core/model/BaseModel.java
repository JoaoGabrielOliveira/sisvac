/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.model;

import com.core.model.interfaces.IBaseModel;
import java.lang.reflect.Method;
import java.sql.ResultSet;

public class BaseModel<I extends IBaseModel> implements IBaseModel{
    
    
    @Override
    public void mapToModel(ResultSet map){
        Method method1, method2;
        
        try{    
            method1 = this.getClass().getMethod("setName", this.getClass());
            method2 = this.getClass().getMethod("set" + "age" , this.getClass());

            method1.invoke(this, map.getString("name"));
            method2.invoke(this, map.getString("age"));
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
}
