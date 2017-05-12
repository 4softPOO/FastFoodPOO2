/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.modelo;


import java.sql.*;
import fastfood.modelo.Conexion;
import fastfood.controlador.Opciones;
import fastfood.modelo.Conexion;

/**
 *
 * @author Andres Arias
 */
public class Opciones_server {

    public Opciones_server() {
        
    }
    
    public void obtenerDatosDB() throws Exception{
        System.out.println("server ola k ase");
        Statement stamento = cn.createStatement();
        ResultSet resultado = stamento.executeQuery("SELECT telefono, direccion from usuario where idusuario = 1");
        String capTel="";
        String capDir="";
        resultado.next();
        capTel=resultado.getString("telefono");
        capDir=resultado.getString("direccion");
        System.out.println(capDir+"\n"+capTel);
        
    }
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
