package com.core.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class Operator {
    protected Connector connector;
    private static Operator instance;

    public Operator(Connector connector){
        this.connector = connector;
    }
    
    public ResultSet feat(String sql, Object... params) throws SQLException{
        this.connector.connect();
        PreparedStatement statement = this.getStatement(sql, params);

        ResultSet result = statement.executeQuery(sql);
        
        this.connector.disconnect();
        return result;
    }
    
    public Boolean execute(String sql) throws SQLException {
        this.connector.connect();
        
        PreparedStatement statement = this.getStatement(sql);

        Boolean result = statement.execute(sql);
        this.connector.disconnect();
        return result;
    }
    
    private PreparedStatement getStatement(String sql, Object... params) throws SQLException{
        PreparedStatement statement = this.connector.getConnection().prepareStatement(sql);
        for(int i = 0; i < params.length; i++){
            statement.setObject(i,params[i]);
        }
        return statement;
    }
}
