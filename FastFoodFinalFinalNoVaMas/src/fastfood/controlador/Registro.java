/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;
import fastfood.vista.registro;


/**
 *
 * @author Paua
 */


public class Registro  {
    
   private  String nombre ="Carlos ";
   private  String apellido="Santamaria";
   private  String direccion = "call 68b #31-03";
   private  String correo ="csantamaria@hotmail.com";
   private  String contraseña = "abc123"; 
   private  String valContraseña = "abc123";
   private  String tarjetaCredito = "MasterCard";
   private  String fecha = "02/2023"; 
   private  String codigoSeguridad =" 232";  
   private  String numero = "23457698132457";
   private  String telefono = "1234567";
    
   public Registro() {  
          }   
   /*-----------------------------------Metodos GETTERS Y SETTERS---------------------------------------------*/
      
   public void nombre(String nombre){
      this.nombre = nombre;  
    } 
  
public void apellido (String apellido){   
   this.apellido = apellido;
    }

public void direccion (String direccion){
   this.direccion = direccion;  
}    

public void correo (String correo){
    this.correo = correo; 
}

public void contraseña (String contraseña){
    this.contraseña = contraseña;
}

public void valContraseña(String valContraseña){
    this.valContraseña = valContraseña;
    }

public void tarjetaCredito (String tarjetaCredito){
    this.tarjetaCredito = tarjetaCredito; 
}
 
public void fecha (String fecha){
    this.fecha = fecha; 
}    

public void  codigoSeguridad (String  codigoSeguridad){
    this.codigoSeguridad = codigoSeguridad;
}

public void numero (String numero){
    this.numero = numero;
}

public void telefono(String  telefono ){
    this.telefono = telefono; 
}

public void validarContra(){

if (contraseña == valContraseña){

    System.out.println("Validacion correcta ");
} 
else
    System.out.println("Contraseña incorrecta");
    }
}
