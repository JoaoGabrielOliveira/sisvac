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

        ResultSet result = statement.executeQuery();
        
        this.connector.disconnect();
        return result;
    }
    
    public Boolean execute(String sql,Object... params) throws SQLException {
        this.connector.connect();
                
        PreparedStatement statement = this.getStatement(sql, params);

        Boolean result = statement.execute(sql);
        this.connector.disconnect();
        return result;
    }
    
    private PreparedStatement getStatement(String sql, Object[] params) throws SQLException{
        PreparedStatement statement = this.connector.getConnection().prepareStatement(sql);
        
        for(int i = 0, j = 1; i < params.length; i++, j++){
            statement.setObject(j, params[i]);
        }
        return statement;
    }
}
