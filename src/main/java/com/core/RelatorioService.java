package com.core;

import com.core.MainOperator;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import com.core.relatorios.Relatorio;
import java.sql.SQLException;


public class RelatorioService{
    public MainOperator operador;
    
    public RelatorioService(){
        this.operador = new MainOperator();
    }
    
    public HashMap<String, Object> execute(Relatorio relatorio, String[] colunas, Object[] params ) throws SQLException {
        System.out.println(relatorio.getQuery());
        
        ResultSet result = operador.feat(relatorio.getQuery(), params);
        
        relatorio.getDadosFromResultSet(result);
        
        return relatorio.getDados();
    }
}
