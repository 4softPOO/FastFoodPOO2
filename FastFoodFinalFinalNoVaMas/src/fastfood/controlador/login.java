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
        validarDatos();
    }


    public String getUsuario() {
        return usuario;
    }


    public char[] getContra() {
        return contra;
    }

    /*----------------------------------------------------------------------------------------------------------*/
    
    public void validarDatos (){
    
       
        
        System.out.print("Usuario "+ getUsuario()+ "Contraseña " + getContra());
        
          
  
    }
    /*
    strin contraseña ="Hola";
    string contraseña = "Usuairo"
    
    public String validar(){
    
    if(usuario = getUsuario )
     
    System.out.println("Usuario valido"+ getUsuario)
    
    }
    
    
    


}*/
    
}
    

