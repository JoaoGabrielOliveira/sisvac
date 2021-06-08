/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisvac.controller;

import com.sisvac.model.Funcionario;
import com.core.Service;
import java.sql.SQLException;

/**
 *
 * @author Joao Conceicao
 */
public class LoginController {
    
    public static Funcionario funcionarioLogado;
    
    public static void login(String email, String senha){
        Service<Funcionario> service = new Service(Funcionario.class);
        
        //Find vai procurar apenas pela chave primaria
        //service.find(1);
        
        String paramEmail = "email:" + email;
        String paramSenha = "senha:" + senha;
        
        try{
            LoginController.funcionarioLogado = service.findBy(paramEmail, paramSenha);
            
            if(LoginController.funcionarioLogado == null){
                javax.swing.JOptionPane.showMessageDialog(null,"Funcionario não cadastrado. Fala com o administrador.");
            }

        } catch (SQLException ex) {
            
        } catch (ReflectiveOperationException ex) {
            
        }
        
        
    }
    
}
