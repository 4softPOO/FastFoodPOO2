/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.vista.*;

import fastfood.controlador.*;

/**
 *
 * @author Andres Arias
 */
public class credito {

    public String numero;
    public String numeron = "1234123412341234";
    public String fecha;
    public String fechan = "11/18";
    public String pass;
    public String passn = "1234";

    public credito() {

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void actualizartargeta() {
        passn = pass;
        numeron = numero;
        fechan = fecha;
        System.out.println(fecha);
        System.out.println(numero);
        System.out.println(pass);

    }
}
