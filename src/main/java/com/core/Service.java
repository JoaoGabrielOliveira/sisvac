package com.core;

import com.core.model.BaseModel;
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
