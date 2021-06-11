/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.relatorios;

public class RelatorioVacinacao extends Relatorio {
    
    @Override
    public void construir(){
        
        this.colunas = new String[]{
            "maiorOuIgual90",
            "entre70e90","entre50e70",
            "menorOuIgual50"
        };
        
        this.setQuery("SELECT"
                + this.maiorOuIgual90() + ","
                + this.entre70e90() + ","
                + this.entre50e70() + ","
                + this.menorOuIgual50()
        );
    }
    
    @Override
    public void execute(Object... params) throws Exception{
        if(params.length != 2)
            throw new Exception("Insira os número correto de parâmetros");
        
        this.addParams(params[0]);
        this.addParams(params[1]);
        
        this.executeQuery();
    }
    
    @Override
    public void getDadosFromResultSet(java.sql.ResultSet map)throws java.sql.SQLException{
        if(map.next()){
            for(String coluna : this.colunas)
                this.dados.put(coluna, map.getInt(coluna));
        }
    }
    
    private String maiorOuIgual90(){
        return this.getJoinQuery("p.DT_NASCIMENTO <= DATE_ADD(NOW(), INTERVAL -90 YEAR)",
                "maiorOuIgual90");
    }
    private String entre70e90(){
        return this.getJoinQuery("p.DT_NASCIMENTO <= DATE_ADD(NOW(), INTERVAL -70 YEAR) AND p.DT_NASCIMENTO >= DATE_ADD(NOW(), INTERVAL -90 YEAR)",
                "entre70e90");
    }
    private String entre50e70(){      
        return this.getJoinQuery("p.DT_NASCIMENTO <= DATE_ADD(NOW(), INTERVAL -50 YEAR) AND p.DT_NASCIMENTO >= DATE_ADD(NOW(), INTERVAL -70 YEAR)",
                "entre50e70");
    }
    private String menorOuIgual50(){
        return this.getJoinQuery("p.DT_NASCIMENTO >= DATE_ADD(NOW(), INTERVAL -50 YEAR)", "menorOuIgual50");
    }
    
    private String getJoinQuery(String where, String alies){
        return "(SELECT count(v.id) FROM tb_vacinado v " +
                "INNER JOIN tb_paciente p ON v.id_paciente = p.ID WHERE " +
                where + " ) as " + alies;
    }    
    
    public Integer getMaiorOuIgual90(){
        return (Integer)this.dados.get("maiorOuIgual90");
    }
    public Integer getEntre70e90(){
        return (Integer)this.dados.get("entre70e90");
    }
    public Integer getEntre50e70(){      
        return (Integer)this.dados.get("entre50e70");
    }
    public Integer getMenorOuIgual50(){
        return (Integer)this.dados.get("menorOuIgual50");
    }
}
