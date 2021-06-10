package com.core.relatorios;

import javax.swing.JPanel;

public interface IRelatorio {
    
    public void setQuery(String param);
    public String getQuery();
    
    public void setDados(Object[] dados);
    public Object[] getDados();
    
    public void setPainel(JPanel panel);
    public JPanel getPainel();
    
    
}
