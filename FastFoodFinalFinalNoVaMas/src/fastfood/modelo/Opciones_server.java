/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.modelo;

import java.sql.*;
import fastfood.modelo.Conexion;
import fastfood.controlador.opciones;
import fastfood.modelo.Conexion;

/**
 *
 * @author Andres Arias
 */
public class Opciones_server {

    opciones obj;

    public Opciones_server() {

    }

    public opciones obtenerDatosDB() throws SQLException {
        Statement stamento = cn.createStatement();
        ResultSet resultado = stamento.executeQuery("SELECT telefono, direccion, nombre1, apellido1, contraseña, numero from usuario, metodo_pago where idusuario = 1 and cod_metodo_pago = idmetodo_pago;");
        String capTel = "";
        String capDir = "";
        String capNom = "";
        String capApe = "";
        String contraseña = "";
        String card = "";
        resultado.next();
        capTel = resultado.getString("telefono");
        capDir = resultado.getString("direccion");
        capNom = resultado.getString("nombre1");
        capApe = resultado.getString("apellido1");
        contraseña = resultado.getString("contraseña");
        card = resultado.getString("numero");
        obj = new opciones();
        obj.setDireccion(capDir);
        obj.setTelefono(capTel);
        obj.setContraAntigua(contraseña);
        System.out.println(contraseña);

        return obj;

    }

    public opciones actualizarDatosDB() throws SQLException {
        String contraseñaActual;
        Statement stamento = cn.createStatement();
        opciones obj = new opciones();
        contraseñaActual = obj.getContraNuevaVista2();
        System.out.println(contraseñaActual);
        PreparedStatement actualizar = cn.prepareStatement("UPDATE usuario SET contraseña = ' " + contraseñaActual + "' WHERE idusuario = 1;");
        actualizar.executeUpdate();
        System.out.println("actualizado");
        return obj;
    }

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
