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
    public String eleccion = "visa";
    public String titular;

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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void actualizartarjeta() {
        if (getNumero().equals(numeron)) {

            System.out.println("la targeta ya existe, ingrese otra");
        } else {
            numeron = numero;
            fechan = fecha;
            eleccion = titular;
            passn = pass;
        }
        System.out.println(numeron);
        System.out.println(fechan);
        System.out.println(eleccion);
        System.out.println(passn);
    }
}
