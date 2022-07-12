
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
public class AccionesPasatiempos {
    private ConexionDB conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesPasatiempos() {
        conexion = new ConexionDB();
        con = conexion.conectar();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        } 
    }
    public final void cerrarConexion() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            System.out.println(" - No se pudo cerrar la conexión a MySQL");
            System.out.println(ex);
        }
    }
    public Vector<Object[]> getPasatiempos( int id ) {
        try {
            String query = "select hobbie, alarma_pasatienpo from caso_dos where FK_usuario =" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);

            Vector<Object[]> pasatiempos = new Vector(10, 1);

            while (res.next()) {
                Object[] pasatiempo = new Object[2];

                pasatiempo[0] = res.getString("hobbie");
                pasatiempo[1] = res.getLong("alarma_pasatienpo");

                pasatiempos.addElement( pasatiempo );
            }

            return pasatiempos;

        } catch (SQLException ex) {
            System.out.println(" - No se pudieron obtener los pasatiempos");
            System.out.println(ex);
            this.cerrarConexion();
            return null;
        }
    }   
    
}
