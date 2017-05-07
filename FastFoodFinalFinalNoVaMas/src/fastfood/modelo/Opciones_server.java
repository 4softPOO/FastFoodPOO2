/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.modelo;

import fastfood.modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import fastfood.controlador.Opciones;

/**
 *
 * @author Andres Arias
 */
public class Opciones_server {

    public Opciones_server() {
        
    }
    
    Opciones op = new Opciones();
        
        public Opciones obtenerDatosDBopciones(Connection Conexion, Opciones Opciones)throws SQLException{
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        Statement stament = null;
        ResultSet resultado;
        PreparedStatement consulta;
        
        
        String selectSQL = "Select idusuario, nombre1, apellido1, telefono, direccion, contraseña, numero FROM usuario, metodo_pago where idusuario = 1 and usuario.cod_metodo_pago = metodo_pago.idmetodo_pago;";
       
            consulta = Conexion.prepareStatement(selectSQL);
      //      consulta.setInt(1, op.getIdusuario());
            resultado = consulta.executeQuery();
            resultado.next();
            op.setContraAntigua(resultado.getString("contraseña"));
            op.setDireccion(resultado.getString("direccion"));
            op.setTelefono(resultado.getString("telefono"));
            op.setNombre(resultado.getString("nombre1"));
            op.setApellido(resultado.getString("apellido1"));
            op.setCodecard(resultado.getString("numero"));
            op.setIdusuario(resultado.getInt("idusuario"));
            
            return op;
    }
}
