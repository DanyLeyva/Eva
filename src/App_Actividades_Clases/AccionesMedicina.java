/** AccionesMedicina.
 * Esta clase se conecta a DB y hace todas las peticiones respecto a la medicina
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
public class AccionesMedicina {
    
    private ConexionDB conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesMedicina() {
        conexion = new ConexionDB();
        con = conexion.conectar();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        }    
    }
    public Vector<Object[]> getMedicinas( int id ) {
        try {
            String query = "select nombre, alarma_medicinas from caso_seis where FK_usuario=" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);

            Vector<Object[]> medicinas = new Vector(10, 1);

            while (res.next()) {
                Object[] medicina = new Object[2];

                medicina[0] = res.getString("nombre");
                medicina[1] = res.getLong("alarma_medicinas");

                medicinas.addElement( medicina );
            }

            return medicinas;

        } catch (SQLException ex) {
            System.out.println(" - No se pudieron obtener los familiares");
            System.out.println(ex);
            this.cerrarConexion();
            return null;
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
