/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.modelo.*;
import fastfood.vista.*;

import fastfood.controlador.credito;



/**
 *
 * @author Paua
 */
public class Opciones {
    
    private fastfood.modelo.Opciones_server server;

    public int idusuario;
    public String contraAntigua;
    public String contraseñaDB;
    public String contraNueva;
    public String repetirContra;
    public String telefono;
    public String telefononDB;
    public String direccion;
    public String direccionnDB;
    public String fecha;
    public String nombre;
    public String apellido;
    public String codecard;

    public Opciones() {
        server = new fastfood.modelo.Opciones_server();
    }

    public String getCodecard() {
        return codecard;
    }

    public void setCodecard(String codecard) {
        this.codecard = codecard;
    }

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
    
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getContraAntigua() {
        return contraAntigua;
    }

    public void setContraAntigua(String contraAntigua) {
        this.contraAntigua = contraAntigua;
    }

    public String getContraNueva() {
        return contraNueva;
    }

    public void setContraNueva(String contraNueva) {
        this.contraNueva = contraNueva;
    }

    public String getRepetirContra() {
        return repetirContra;
    }

    public void setRepetirContra(String repetirContra) {
        this.repetirContra = repetirContra;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void actualizarDatos() {
        System.out.println(getContraAntigua());
        System.out.println(getContraNueva());
        System.out.println(getRepetirContra());
        System.out.println(getTelefono());
        System.out.println(getDireccion());
        if (getContraAntigua().equals(contraseñaDB)) {
            if (getContraNueva().equals(getRepetirContra())) {
                contraseñaDB = contraNueva;
                telefononDB = telefono;
                direccionnDB = direccion;
                System.out.println("contraseña cambiada con exito");
                System.out.println("datos actualizados");
            } else {
                System.out.println("contraseña nueva no coincide");
            }
        } else {
            System.out.println("contraseña antigua incorrecta");
        }
        System.out.println(contraseñaDB);
        System.out.println(telefono);
        System.out.println(direccion);
    }
        
/*        try{
        PreparedStatement pst = cn.prepareStatement("UPDATE sucursal SET id_sucursal='"+codigo.getText()+"',nombre_sucursal='"+nombre.getText()+"',direccion_sucursal='"+direccion.getText()+"' WHERE id_sucursal='"+codigo.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
        }catch (Exception zaa){
        System.out.print(zaa.getMessage());
        }
*/
   
}
