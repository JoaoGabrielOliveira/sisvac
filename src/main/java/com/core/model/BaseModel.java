/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.model;

import com.core.Extensions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseModel<I extends IBaseModel> implements IBaseModel{
    protected String tableName;
    protected String primatyKeyName;
    
    @Override
    public void mapToModel(ResultSet map) throws ReflectiveOperationException, SQLException{
        Class<?> selfClass = this.getClass();
        
        for(Field field : selfClass.getDeclaredFields()){
            String fieldName = field.getName();
            String setMethodName = "set" + Extensions.capitalize(fieldName);

            Method set = selfClass.getMethod(setMethodName, field.getType());
            set.invoke(this, map.getObject(fieldName, field.getType()));
        }
    }
    
    public String[] getColumns(){
        Field[] selfFields = this.getClass().getDeclaredFields();
        String[] columns = new String[selfFields.length];
        
        for(int i = 0; i < selfFields.length; i++){
            columns[i] = selfFields[i].getName();
        }
        
        return columns;
    }
    
    public String getTableName(){
        if(this.tableName == null)
            this.setTableName(this.getClass().getName());

        return this.tableName;
    }
    
    public String getPrimatyKeyName(){
        if(this.primatyKeyName == null)
            this.setPrimatyKeyName("id");

        return this.primatyKeyName;
    }

    protected void setTableName(String tableName){
        this.tableName = tableName;
    }
    
    protected void setPrimatyKeyName(String primatyKeyName){
        this.primatyKeyName = primatyKeyName;
    }
}
