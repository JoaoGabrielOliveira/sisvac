package com.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    String host, port, databaseName, user, pass;
    private Connection connection;
    
    public Connector(String host, String port, String databaseName, String user, String pass){
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.user = user;
        this.pass = pass;
    }
    
    public void connect() throws SQLException{
        String url = this.host + ":" + this.port;
        this.connection = DriverManager.getConnection(url, this.user, this.pass);
    }
    
    public Boolean isConnect() throws SQLException{
        return !this.connection.isClosed();
    }
    
    public void disconnect(){
        this.connection = null;
    }
    
    public Connection getConnection(){
        return this.connection;
    }
}
