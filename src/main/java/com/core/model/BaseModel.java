/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.model;

import com.core.Extensions;
import com.core.Service;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class BaseModel<I extends IBaseModel> implements IBaseModel{
    protected String tableName;
    protected String primatyKeyName;
    protected Integer columnsLength;
    
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
    
    public Object[] getValuesIfNotNull() throws ReflectiveOperationException{
        ArrayList<Object> valuesNotNull = new ArrayList();
        
        for(Object value : this.getValues()){
            if(value != null){
                valuesNotNull.add(value);
            }
        }
        
        return valuesNotNull.toArray();
    }
    
    public Object[] getValues() throws ReflectiveOperationException {
        Class<?> selfClass = this.getClass();
        ArrayList<Object> values = new ArrayList();
        
        
        for(Field field : selfClass.getDeclaredFields()){
            String fieldName = field.getName();
            String getMethodName = "get" + Extensions.capitalize(fieldName);

            Method get = selfClass.getMethod(getMethodName);
            Object value = get.invoke(this);
            values.add(value);
        }
        
        return values.toArray();      
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
    
    public Object getPrimatyKeyValue()throws ReflectiveOperationException{
        Method getMethod = this.getClass().getDeclaredMethod("get" + Extensions.capitalize(this.getPrimatyKeyName()));
        return getMethod.invoke(this);
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
