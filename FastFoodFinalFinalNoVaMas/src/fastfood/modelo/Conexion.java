package fastfood.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection conectar=null;
    
    public Connection conexion(){
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/fastfood", "root", "");
    } catch (Exception e){
        System.out.print(e.getMessage());
   
    }
    return conectar;    
    }  
}