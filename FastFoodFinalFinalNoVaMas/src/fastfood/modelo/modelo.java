/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.modelo;
import fastfood.controlador.menuPrincipalControlador;

/**
 *
 * @author COlo
 */
public class modelo {
    
    private String nombre;
    
    public modelo (){
    
    }
    
    
    public void capturaNombre(){
         
        menuPrincipalControlador obj1 = new menuPrincipalControlador();
        obj1.setNombre(nombre);
        obj1.imprimirNombre();
        
    }
    
    
}
