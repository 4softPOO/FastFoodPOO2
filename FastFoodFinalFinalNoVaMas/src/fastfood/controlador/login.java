/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.vista.*;

import fastfood.controlador.*;


/**
 *
 * @author Paua
 */
public class login {
    
    public String user;
    public String pass; 
    public String usuario = "otorres";
    public String  contra = "4576";
    

    

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
         

    if ( user  != usuario  || pass != contra){
      
        System.out.println ("Usuario no valido" + getUsuario() + "Contraseña no valida" + getContra());        
    
    } else{
        System.out.println ("Usuario  valido" + getUsuario() + "Contraseña valida" + getContra());        
    
    }   
    
    }
  }
   

 
 
