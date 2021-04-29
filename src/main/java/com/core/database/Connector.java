package com.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    String host;
    String port;
    String databaseName;
    String user;
    String pass;
    
    private Connection connection;
    
    public Connector(String host, String port, String databaseName, String user, String pass){
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.user = user;
        this.pass = pass;
    }
    
    public Boolean isConnect() throws SQLException{
        return !this.connection.isClosed();
    }

    public Connection connect() throws SQLException{
        this.connection = DriverManager.getConnection(this.getUrl(), this.user, this.pass);
        return this.getConnection();
    }
    
    public void disconnect(){
        this.connection = null;
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public String getUrl(){
        return "jdbc:" + this.host + ":" + this.port + "/" + this.databaseName;
    }
}
