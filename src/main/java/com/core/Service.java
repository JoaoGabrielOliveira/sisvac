package com.core;

import com.core.model.BaseModel;
import com.core.Extensions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Service<T extends BaseModel> {
    protected MainOperator operator;
    protected Class<T> instance;
    
    public Service(Class<T> object){
        this.operator = new MainOperator();
        this.instance = object;
    }
    
    public List<T> list() throws SQLException{
        
        List<T> list = new ArrayList<>();
        
        ResultSet result = this.operator.feat("SELECT * FROM users");
        
        try{
            while(result.next()){
                T obj = this.getInstance().newInstance();

                try{
                    for(Field field : this.getInstance().getDeclaredFields()){
                        String fieldName = field.getName();
                        String column = "set" + Extensions.capitalize(fieldName);

                        Method set = this.getInstance().getMethod(column, field.getType());
                        set.invoke(obj, result.getString(fieldName));
                        
                        list.add(obj);
                    }
                }
                catch(IllegalArgumentException e){
                    continue;
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        return list;
    }
    
    protected MainOperator getOperator(){
        return this.operator;
    }
    
    protected Class<T> getInstance(){
        return this.instance;
    }
}
