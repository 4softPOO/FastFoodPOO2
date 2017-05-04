/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.modelo.Conexion;
import fastfood.vista.*;

import fastfood.controlador.credito;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Paua
 */
public class opciones {

    public String contraAntigua;
    public String contraseñaDB;
    public String contraNueva;
    public String repetirContra;
    public String telefono;
    public String telefononDB;
    public String direccion;
    public String direccionnDB;
    public String fecha;

    public opciones() {
        
        

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
    
    public void obtenerDatosDB(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        Statement st = null;
        
        try {
            st = cn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs = st.executeQuery("SELECT  ");
        } catch (SQLException ex) {
            Logger.getLogger(opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try{
//        
//        PreparedStatement pst = cn.prepareStatement("UPDATE sucursal SET id_sucursal='"+codigo.getText()+"',nombre_sucursal='"+nombre.getText()+"',direccion_sucursal='"+direccion.getText()+"' WHERE id_sucursal='"+codigo.getText()+"'");
//        pst.executeUpdate();
//        mostrardatos("");
//        }catch (Exception zaa){
//        
//        System.out.print(zaa.getMessage());
//        }
   }
    
}
