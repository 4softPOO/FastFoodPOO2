/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.modelo;

import fastfood.controlador.opciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**                 
 * 
 *
 * @author ESTUDIANTE1201T
 */
public class login {
    
    public opciones obtenerDatosDB() throws SQLException {
        Statement stamento = cn.createStatement();
        ResultSet resultado = stamento.executeQuery("SELECT telefono, direccion, nombre1, apellido1, contraseña, numero from usuario, metodo_pago where idusuario = 1 and cod_metodo_pago = idmetodo_pago;");
    
}
