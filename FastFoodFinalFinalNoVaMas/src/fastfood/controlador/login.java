/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;
import fastfood.vista.*;


/**
 *
 * @author Paua
 */
public class login {
    
    
    private String usuario;
    private char[] contra;
    

    

    public login(){
    
    }
  
    /*-----------------------------------Metodos GETTERS Y SETTERS---------------------------------------------*/
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
        
    }

    public void setContra(char[] contra) {
        this.contra = contra;
        //validarDatos();
    }


    public String getUsuario() {
        return usuario;
    }


    public char[] getContra() {
        return contra;
    }

    
}

    /*----------------------------------------------------------------------------------------------------------*/
  
    /*
validarDatos() {

    if(usuario !=  getUsuario || contraseña != getContraseña)
    

    System.out.println ("Usuario no valido" + getUsuario + "Contraseña no valida" + getContraseña)        
    }    

  usuario = "Mario"
    contra = "1234"
