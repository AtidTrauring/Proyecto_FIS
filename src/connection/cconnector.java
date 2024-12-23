package connection;

import java.sql.*;
import mensajes.cmensajes;

public class cconnector {

    Connection conectar = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
        } catch (SQLException ex) {
            String cadena = "SQLException: " + ex.getMessage() + "\n" + "SQLState: " + ex.getSQLState()
                    + "\n" + "VendorError: " + ex.getErrorCode();
            cmensajes.mistake(cadena, "Conexión");
        } catch (ClassNotFoundException ex) {
            cmensajes.mistake("ERROR con los controladores", "Conexión erronea" + ex);
        }
        return conectar;
    }

    public void cerrar_conexion(Connection conn) throws SQLException {
        conn.close();
    }
;

}
