package com.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.core.model.User;


public class Service {
    public MainOperator operator;
    
    public Service(){
        this.operator = new MainOperator();
    }
    
    public List<User> list() throws SQLException{
        List<User> list = new ArrayList<>();
        ResultSet result = this.operator.feat("SELECT * FROM users");
        
        while(result.next()){
            User user = new User();
            
            user.setName(result.getString("name"));
            user.setAge(result.getInt("age"));
            
            list.add(user);
        }
        
        return list;
    }

    public MainOperator getOperator(){
        return this.operator;
    }
}
