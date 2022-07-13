
package app_connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class ConexionDB {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456789"; // host/nombre_base_datos
    private static final String url = "jdbc:mysql://localhost:3306/eva_prototipo?characterEncoding=utf8&useSSL=false&useUnicode=true";   
    
    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try{
            Class.forName( driver );
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection( url, user, pass );
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if ( con != null){
                System.out.println(" - Conexion completa a Base de Datos");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println(" - Error a la hora de conectarse a la base de datos");
            System.out.println( e );
        }
        return con;
    }
    
    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
