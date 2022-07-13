
package App_Actividades_Clases;

import app_connection.ConexionDB;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo.
 * id_ayuda - int
 * nombre - varchar(255)
 * parentesco - varchar(255)
 * numero - varchar(255)
 * FK_usuario - int y debe de existir usuario con ese ID
 */
public class AccionesAyuda {
    private ConexionDB conexion; 
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesAyuda() {
        conexion = new ConexionDB();
        con = conexion.conectar();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        }
    }
    
    public Vector<Object[]> getNumeros( int id ) {
        try {
            String query = "select id_ayuda, nombre, parentesco, numero from caso_cuatro where FK_usuario=" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);
            
            Vector<Object[]> numeros = new Vector(10, 1);
            
            while( res.next() ) {
                Object[] numero = new Object[4];
   
                numero[0] = res.getInt("id_ayuda");                
                numero[1] = res.getString("nombre");
                numero[2] = res.getString("parentesco");
                numero[3] = res.getString("numero");
                
                numeros.addElement( numero );
            }
            
            return numeros;
            
        } catch (SQLException ex) {
            System.out.println(" - No se pudieron obtener los usuarios");
            System.out.println( ex );
            this.cerrarConexion();
            return null;
        }
    }
    public final void cerrarConexion() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            System.out.println(" - No se pudo cerrar la conexión a MySQL");
            System.out.println( ex );
        }
    }
}
