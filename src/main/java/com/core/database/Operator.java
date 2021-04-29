package com.core.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Operator {
    protected Connector connector;
    private static Operator instance;

    public Operator(Connector connector){
        this.connector = connector;
    }
    
    public ResultSet list(String tableName) throws SQLException{
        this.connector.connect();
        Statement statement = this.connector.getConnection().prepareStatement("SELECT * FROM ?");
        return statement.executeQuery(tableName);
    }
    
    /*
    public static Operator getInstance(Coonector ){
        if(Operator.instance == null){
            Operator.setInstance(new Operator())
        }
    }
    
    protected static void setInstance(Operator operator){
        Operator.instance = operator;
    }*/
}
