package com.sisvac;

import com.core.database.Connector;
import com.core.database.Operator;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        Connector conn = new Connector("mysql://localhost", "3306", "loja", "root", "1234");
        Operator oper = new Operator(conn);
        
        try{
            ResultSet set = oper.list("usuarios");
            while(set.next()){
                System.out.print(set.getString(0));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
