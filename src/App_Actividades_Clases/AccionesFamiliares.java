/** Modulo para mostrar información de familiares.
 */
package App_Actividades_Clases;

import app_connection.Conexion_Base;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class AccionesFamiliares {

    private Conexion_Base conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesFamiliares() {
        conexion = new Conexion_Base();
        con = conexion.conexion();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        }
    }

    public Vector<Object[]> getFamiliares(int id) {
        try {
            String query = "select id_conocidos, nombre, parentesco, cumpleaños from caso_uno where FK_usuario=" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);

            Vector<Object[]> familiares = new Vector(10, 1);

            while (res.next()) {
                Object[] familiar = new Object[4];

                familiar[0] = res.getInt("id_conocidos");
                familiar[1] = res.getString("nombre");
                familiar[2] = res.getString("cumpleaños");
                familiar[3] = res.getString("parentesco");

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
