/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.vista.*;

import fastfood.controlador.menuPrincipalControlador;
import fastfood.modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Paua
 */
public class login {
    
    public String user;
    public String pass ; 
    public String usuario;
    public String  contra ;
    public boolean val1;
   
    

    

    public login(){
    
    }
  
    /*-----------------------------------Metodos GETTERS Y SETTERS---------------------------------------------*/
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
        
    }

    public void setContra(String contra) {
        this.contra = contra;
     
    }


    public String getUsuario() {
        return usuario;
    }


    public String getContra() {
        return contra;
    }

    public void validarDatos() {

        System.out.println(getContra());
        System.out.println(getUsuario());
         

    if ( user.equals(getUsuario())  && pass.equals(getContra())){
      
        System.out.println ("Usuario  valido: " +  usuario + "Contraseña valida: " + contra);        
        val1 = true;
        Login obj = new Login();
        obj.cambiarInterfaz(val1);
        obj.dispose();  
                    
        
    } else{
        System.out.println ("Usuario no valido" + usuario + "Contraseña no valida" + contra);   
    }   
    

    }
  }
   

 
 
