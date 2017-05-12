package fastfood.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexion {

    public Conexion() {
        
    }
    
    Connection conectar=null;
    
    public Connection conexion(){
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/fastfood", "root", "");
        System.out.println("ingrese a la conexion");
    } catch (Exception e){
        System.out.println("no ingrese a la conexion");
        System.out.print(e.getMessage());
   
    }
    return conectar;    
    }  
}