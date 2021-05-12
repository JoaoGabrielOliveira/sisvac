package com.core;
import com.core.database.Operator;
import com.core.database.Connector;
import com.core.config.Environment;

public class MainOperator extends Operator {
    public MainOperator(){
        super(new Connector(
                Environment.DATABASE_HOST, Environment.DATABASE_PORT, Environment.DATABASE_NAME,
                Environment.DATABASE_USER, Environment.DATABASE_PASSWORD
        ));
    }
}
