/** Modulo para mostrar información de familiares.
 */
package App_Actividades_Clases;

import app_connection.ConexionDB;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class AccionesFamiliares {

    private ConexionDB conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesFamiliares() {
        conexion = new ConexionDB();
        con = conexion.conectar();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        }
    }

    public Vector<Object[]> getFamiliares(int id) {
        try {
            String query = "select nombre, parentesco, cumpleaños from caso_uno where FK_usuario=" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);

            Vector<Object[]> familiares = new Vector(10, 1);

            while (res.next()) {
                Object[] familiar = new Object[3];

                familiar[0] = res.getString("nombre");
                familiar[1] = res.getString("parentesco");
                familiar[2] = res.getString("cumpleaños");

                familiares.addElement( familiar );
            }

            return familiares;

        } catch (SQLException ex) {
            System.out.println(" - No se pudieron obtener los familiares");
            System.out.println(ex);
            this.cerrarConexion();
            return null;
        }
    }
    public boolean eliminar( int id ) {
        try {
            String query = "delete from caso_uno where id_conocidos = " + id + ";";
            st.executeUpdate( query );
            return true;
        } catch (SQLException ex) {
            System.out.println(" - No se pudo eliminar la alarma");
            System.out.println( ex );
            this.cerrarConexion();
            return false;
        } 
    }

    public final void cerrarConexion() {
        try
        {
            this.con.close();
        } catch (SQLException ex) {
            System.out.println(" - No se pudo cerrar la conexión a MySQL");
            System.out.println(ex);
        }
    }
}
