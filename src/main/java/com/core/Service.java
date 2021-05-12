package com.core;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Service {
    public MainOperator operator;
    
    public Service(){
        this.operator = new MainOperator();
    }
    
    public void list() throws SQLException{
        ResultSet result = this.operator.feat("SELECT * FROM users");
        
        while(result.next()){
            System.out.println( result.getString("name") );
        }
    }

    public MainOperator getOperator(){
        return this.operator;
    }
}
