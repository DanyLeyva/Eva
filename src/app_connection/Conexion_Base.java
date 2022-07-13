package app_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author numbe
 */
public class Conexion_Base {

    public static int Usuarios = 1;

    Connection cn;
    Statement st;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/eva_prototipo", "root", "");
            System.out.println("Se hizo la conexixon exitosa");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }

}
