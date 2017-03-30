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


public class Registro  {
    
   private  String nombre;
   private  String apellido;
   private  String direccion;
   private  String correo;
   private  char []  contraseña; 
   private  char [] valContraseña;
   private  String tarjetaCredito;
   private  String fecha; 
   private int     codigoSeguridad;  
   private  int    numero;
   private  int    telefono;
    
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

public void contraseña (char [] contraseña){
    this.contraseña = contraseña;
}

public void valContraseña(char[] valContraseña){
    this.valContraseña = valContraseña;
    }

public void tarjetaCredito (String tarjetaCredito){
    this.tarjetaCredito = tarjetaCredito; 
}
 
public void fecha (String fecha){
    this.fecha = fecha; 
}    

public void  codigoSeguridad (int codigoSeguridad){
    this.codigoSeguridad = codigoSeguridad;
}

public void numero (int numero){
    this.numero = numero;
}

public void telefono(int telefono ){
    this.telefono = telefono; 
}

