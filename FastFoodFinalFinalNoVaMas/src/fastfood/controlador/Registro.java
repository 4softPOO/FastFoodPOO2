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
    
   private  String nombre ;
   private  String apellido;
   private  String direccion ;
   private  String correo ;
   private  String contraseña ; 
   private  String valContraseña  ;
   private  String tarjetaCredito ;
   private  String fecha; 
   private  String codigoSeguridad;  
   private  String numero;
   private  String telefono;
    
   public Registro() {  
          }   
   /*-----------------------------------Metodos GETTERS Y SETTERS---------------------------------------------*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getValContraseña() {
        return valContraseña;
    }

    public void setValContraseña(String valContraseña) {
        this.valContraseña = valContraseña;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
      
   
    
    public void mostrar () {
    
        
        System.out.println (getNombre()+" " +getApellido()+" " + getTelefono()+" " + getNumero()+" " +getCodigoSeguridad()+" "+getFecha()+" "  + getValContraseña()+" " +getContraseña()+" " +getCorreo()+" " + getDireccion());        
                
    }
   
}
