package com.core.relatorios;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;

public interface IRelatorio {
    
    public void setQuery(String param);
    public String getQuery();
        
    public void setDados(HashMap<String, Object> dados);
    public HashMap<String, Object> getDados();
    
    public void setPainel(JPanel panel);
    public JPanel getPainel();
    
    public void setParams(List<Object> params);
    public List<Object> getParams();
    public void addParams(Object param);
}
