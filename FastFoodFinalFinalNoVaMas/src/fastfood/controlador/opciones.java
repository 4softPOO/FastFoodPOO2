/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.modelo.Conexion;
import fastfood.vista.*;
import fastfood.modelo.*;

import fastfood.controlador.credito;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Paua
 */
public class opciones {

    public String contraAntigua;
    public String contraVista;
    public String contraNuevaVista1;
    public String contraNuevaVista2;
    public String repetirContra;
    public String telefono;
    public String telefononDB;
    public String direccion;
    public String direccionnDB;
    public String fecha;

    private Opciones_server server;

    public opciones() {
        server = new Opciones_server();

    }

    public String getContraVista() {
        return contraVista;
    }

    public void setContraVista(String contraVista) {
        this.contraVista = contraVista;
    }

    public String getContraNuevaVista1() {
        return contraNuevaVista1;
    }

    public void setContraNuevaVista1(String contraNuevaVista1) {
        this.contraNuevaVista1 = contraNuevaVista1;
    }

    public String getContraNuevaVista2() {
        return contraNuevaVista2;
    }

    public void setContraNuevaVista2(String contraNuevaVista2) {
        this.contraNuevaVista2 = contraNuevaVista2;
    }

    public String getContraAntigua() {
        return contraAntigua;
    }

    public void setContraAntigua(String contraAntigua) {
        this.contraAntigua = contraAntigua;
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

    public opciones obtenerDatosDB() throws Exception {
        //Opciones_server server = new Opciones_server();
        opciones retorno1 = server.obtenerDatosDB();
        retorno1.getTelefono();
        retorno1.getDireccion();

        return retorno1;
    }

    public opciones actualizarDatosDB() throws Exception {
        opciones retorno2 = server.obtenerDatosDB();
        if (retorno2.getContraAntigua().equals(getContraVista())) {
            if (getContraNuevaVista1().equals(getContraNuevaVista2())) {
                server.actualizarDatosDB();
                System.out.println("contraseña y datos actualizados");
            } else {
                System.out.println("contraseña nueva no coincide");
            }
        } else {
            System.out.println("contraseña antigua incorrecta");
        }
        System.out.println(retorno2.getContraAntigua());
        System.out.println(getContraVista());
        System.out.println(getContraNuevaVista2());

        return retorno2;
    }
}
