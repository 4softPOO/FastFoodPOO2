/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.controlador;
import fastfood.modelo.modelo;
import fastfood.vista.*;

/**
 *
 * @author COlo
 */
public class menuPrincipalControlador {
    
    private String nombre;
    
    public menuPrincipalControlador(){

    
    }

    /*------------------------------------METODOS GETTERS Y SETTERS--------------------------------------------*/
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    /*-----------------------------------------------------------------------------------------------------------*/
    
    public void conectarModelo(){
    
        modelo obj = new modelo();
        obj.capturaNombre();
    }
    
    public void imprimirNombre(){
        
        System.out.print(getNombre());
    }
    
}
