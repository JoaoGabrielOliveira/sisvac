package com.core;

import com.core.model.BaseModel;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class Service<T extends BaseModel> {
    protected MainOperator operator;
    protected Class<T> instance;
    
    public Service(Class<T> object){
        this.operator = new MainOperator();
        this.instance = object;
    }
    
    public List<T> list() throws SQLException{
        
        List<T> list = new ArrayList<>();
        ResultSet result;
        try{
            result = this.operator.feat("SELECT * FROM " + this.getNewInstance().getTableName());
            while(result.next()){
                T obj = this.getNewInstance();

                try{
                    obj.mapToModel(result);
                    list.add(obj);
                }
                catch(IllegalArgumentException e){
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        return list;
    }
    
    public T find(Object param) throws SQLException, ReflectiveOperationException{
        T objectInstance = this.getNewInstance();
        
        String query = "SELECT * FROM " + objectInstance.getTableName() +
            " WHERE " + objectInstance.getPrimatyKeyName() + " = ?";
        ResultSet result = this.operator.feat(query, param);

        while(result.next()){
            objectInstance.mapToModel(result);
        }

        return objectInstance;
    }
    
    public Boolean delete(Object param) throws SQLException, ReflectiveOperationException{
        T objectInstance = this.getNewInstance();
        
        String query = "DELETE FROM " + objectInstance.getTableName() +
            " WHERE " + objectInstance.getPrimatyKeyName() + " = ?";
        
        return this.operator.execute(query, param);
    }
    
    public Boolean create(Object... params) throws SQLException, ReflectiveOperationException{
        String query;
        
        T objectInstance = this.getNewInstance();
        
        query = "INSERT INTO " + objectInstance.getTableName() + "(" + String.join(",", objectInstance.getColumns()) + ")"
        + " VALUES (" + this.getInterrogativeQuote(params.length) + ")";

        Boolean result = this.operator.execute(query, params);
        
        return result;
    }
    
    protected String getInterrogativeQuote(Integer total){
        String[] values = new String[total];
        for(int i = 0; i < total; i++)
            values[i] = "?";
        return String.join(",", values);
    }
    
    protected MainOperator getOperator(){
        return this.operator;
    }
    
    protected Class<T> getInstance(){
        return this.instance;
    }
    
    protected T getNewInstance() throws java.lang.ReflectiveOperationException{
        return this.getInstance().getConstructor().newInstance();
    }
}
