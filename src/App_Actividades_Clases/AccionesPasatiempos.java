
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
public class AccionesPasatiempos {
    private Conexion_Base conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public AccionesPasatiempos() {
        conexion = new Conexion_Base();
        con = conexion.conexion();
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
            String query = "select id_pasatiempos, hobbie, alarma_pasatienpo from caso_dos where FK_usuario =" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);

            Vector<Object[]> pasatiempos = new Vector(10, 1);

            while (res.next()) {
                Object[] pasatiempo = new Object[3];

                pasatiempo[0] = res.getString("id_pasatiempos");
                pasatiempo[1] = res.getString("hobbie");
                pasatiempo[2] = res.getLong("alarma_pasatienpo");

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
    public boolean eliminar( int id ) {
        try {
            String query = "delete from caso_dos where id_pasatiempos = " + id + ";";
            st.executeUpdate( query );
            return true;
        } catch (SQLException ex) {
            System.out.println(" - No se pudo eliminar la alarma");
            System.out.println( ex );
            this.cerrarConexion();
            return false;
        } 
    }
    
}
