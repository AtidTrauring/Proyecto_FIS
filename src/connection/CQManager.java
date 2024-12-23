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
    private Statement st = null; //Capacidad para traducir las query
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
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                valorObtenido = rs.getString(1);
            } else {
                // Comento el mensaje para que no aparacezca en multiples ocasiones
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
                st.close();
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
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
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
                st.close();
            } catch (SQLException e) {
            }
            //cerrar conexion
            conector.cerrar_conexion(conn);
        }
        return resultados;
    }

    // Esto es para que funcione la transferencia
    public ArrayList<String[]> buscar_para_otras_Trans(String consulta) throws SQLException {
        //1. Abrir la conexion
        conn = conector.conectar();
        //2. Ejecutar la query(consulta)
        try {
            resultados = new ArrayList<>();
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if (rs == null) {
                cmensajes.warning("Elementos no encontrados", "buscar objetos");
            } else {
                while (rs.next()) {
                    resultados.add(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)});
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
                st.close();
            } catch (SQLException e) {
            }
            //cerrar conexion
            conector.cerrar_conexion(conn);
        }
        return resultados;
    }

    public ArrayList<String[]> buscar_para_Trans(String consulta) throws SQLException {
        //1. Abrir la conexion
        conn = conector.conectar();
        //2. Ejecutar la query(consulta)
        try {
            resultados = new ArrayList<>();
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if (rs == null) {
                cmensajes.warning("Elementos no encontrados", "buscar objetos");
            } else {
                while (rs.next()) {
                    resultados.add(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)});
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
                st.close();
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

    public ArrayList<String[]> busquedas(String consulta) throws SQLException {
        conn = conector.conectar();
        try {
            resultados = new ArrayList<>();

            // Ensure the connection is not null before creating a statement
            if (conn != null) {
                st = conn.createStatement();
            } else {
                cmensajes.mistake("Connection failed", "buscar objetos");
                return resultados;  // Return empty results if connection failed
            }

            rs = st.executeQuery(consulta);

            if (rs == null) {
                cmensajes.warning("Elementos no encontrados", "buscar objetos");
            } else {
                while (rs.next()) {
                    resultados.add(new String[]{
                        rs.getString(1)
                    });
                }
            }
        } catch (SQLException ex) {
            String cadena = "SQLException: " + ex.getMessage() + "\n"
                    + "SQLState: " + ex.getSQLState() + "\n"
                    + "VendorError: " + ex.getErrorCode();
            cmensajes.mistake(cadena, "Conexion");
        } finally {
            try {
                // Null check before closing statement
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                // Handle exception silently or log it
            } finally {
                conector.cerrar_conexion(conn);  // Ensure the connection is closed
            }
        }
        return resultados;
    }

    public boolean insertar(String consulta) throws SQLException {
        conn = conector.conectar();
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            cmensajes.warning("Error: \n" + e.getMessage(), "Insert Objeto");
        } finally {
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public boolean actualizar(String consulta) throws SQLException {
        conn = conector.conectar();
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            cmensajes.warning("Error: " + e.getMessage(), "Update Objet");
        } finally {
            conector.cerrar_conexion(conn);
        }
        return false;
    }
}
