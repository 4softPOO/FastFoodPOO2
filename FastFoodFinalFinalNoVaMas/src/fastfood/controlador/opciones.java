/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;

import fastfood.vista.Opciones;

/**
 *
 * @author Paua
 */
public class opciones {

    public String contraAntigua;
    public String contraseña = "abc123";
    public String contraNueva;
    public String repetirContra;
    public String telefono;
    public String direccion;

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
        if (getContraAntigua().equals(contraseña)) {
            if (getContraNueva().equals(getRepetirContra())) {
                contraseña = contraNueva;
                System.out.println("contraseña cambiada con exito");
            } else {
                System.out.println("contraseña nueva no coincide");
            }
        } else {
            System.out.println("contraseña antigua incorrecta");
        }
        System.out.println(contraseña);
    }
}
