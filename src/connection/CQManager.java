package connection;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import mensajes.cmensajes;

public class CQManager {

    //************ Atributos ************
    private Connection conn = null;
    private Statement stmt = null; //Capacidad para traducir las query
    private ResultSet rs = null;
    private final cconnector conector = new cconnector();
    private ArrayList<String[]> resultados;

    //************ Metodos ************
    public String buscarValor(String consulta) throws SQLException {
        String valorObtenido = null;
        //1. Abrir la conexion
        conn = conector.conectar();
        //2. Ejecutar la query(consulta)
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(consulta);
            if (rs.next()) {
                valorObtenido = rs.getString(1);
            } else {
                // Comento el mensaje para que no aparacezca en multiples veces
//                cmensajes.warning("Elemento no encontrado", "Buscar objeto");

            }
        } catch (SQLException ex) {
            String cadena = "SQLException: " + ex.getMessage() + "\n"
                    + "SQLState: " + ex.getSQLState() + "\n"
                    + "VendorError: " + ex.getErrorCode();
            cmensajes.mistake(cadena, "Conexion");
        } //3. 
        finally {
            //Cerrar los resultados
            try {
                rs.close();
            } catch (SQLException e) {
            }
            //Cerrar el statement
            try {
                stmt.close();
            } catch (SQLException e) {
            }
            //cerrar conexion
            conector.cerrar_conexion(conn);
        }
        return valorObtenido;
    }

    public ArrayList<String[]> buscar_objetos(String consulta) throws SQLException {
        //1. Abrir la conexion
        conn = conector.conectar();
        //2. Ejecutar la query(consulta)
        try {
            resultados = new ArrayList<>();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(consulta);
            if (rs == null) {
                cmensajes.warning("Elementos no encontrados", "buscar objetos");
            } else {
                while (rs.next()) {
                    resultados.add(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),});

                }
            }
        } catch (SQLException ex) {
            String cadena = "SQLException: " + ex.getMessage() + "\n"
                    + "SQLState: " + ex.getSQLState() + "\n"
                    + "VendorError: " + ex.getErrorCode();
            cmensajes.mistake(cadena, "Conexion");
        } //3. 
        finally {
            //Cerrar los resultados
            try {
                rs.close();
            } catch (SQLException e) {
            }
            //Cerrar el statement
            try {
                stmt.close();
            } catch (SQLException e) {
            }
            //cerrar conexion
            conector.cerrar_conexion(conn);
        }
        return resultados;
    }

    public boolean inserta_objeto(String consulta) throws SQLException {
        //1. Abrir la conexion
        conn = conector.conectar();
        //2, Ejecutar la query
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            cmensajes.warning("Error: \n" + e.getMessage(), "Inserta Objeto");
        } finally {
            //3. Cerrar conex
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public boolean elimina_objeto(String consulta) throws SQLException {
        //1. Abrir la conexion
        conn = conector.conectar();
        //2. Correr la query
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            cmensajes.warning("Error: " + e.getMessage(), "Elimina Objeto");
        } finally {
            //3. Cerrarla conexion
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public boolean actualiza_objeto(String consulta) throws SQLException {
        conn = conector.conectar();
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            cmensajes.warning("Error: " + e.getMessage(), "Actualiza Objeto");
        } finally {
            //3. Cerrarla conexion
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public void imprime_resultados(ArrayList<String[]> resultados) {
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(i + " " + Arrays.toString(resultados.get(i)));
        }
        System.out.println(".......................................");
    }

}
