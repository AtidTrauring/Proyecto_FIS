package connection;

import java.sql.SQLException;
import java.util.ArrayList;

public class CModelos {

    //***************** Atributos *******************
    private final CQManager mngr = new CQManager();//Para obtener los metodos de la clase manager
    private String consulta;
    //***************** Metodos *******************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM autos WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objetos_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM autos WHERE autos.id=" + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String marca, String modelo, String color) throws SQLException {
        consulta = "INSERT INTO autos(id, Marca, Modelo, Color) VALUES (null,'" + marca + "','" + modelo + "','" + color + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE FROM autos WHERE autos.id = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String marca, String modelo, String color) throws SQLException {
//        consulta = "UPDATE `autos` SET `Marca`='" + marca + "' WHERE autos.id = " + id + ";";
        consulta = "UPDATE `autos` SET `Marca`='" + marca + "',`Modelo`='" + modelo + "',`Color`='" + color + "' WHERE autos.id = '" + id + "'";
        return mngr.actualiza_objeto(consulta);
    }

    public String busca_nombre(String nombre) throws SQLException {
        //consulta = "SELECT `Id_pasajero` FROM `pasajero` WHERE Id_persona = '" + idPersona + "';";
        consulta = "SELECT `nombre` FROM `banco` WHERE nombre = '" + nombre + "';";
        return mngr.buscarValor(consulta);
    }

    public boolean insertaBanco(String banco) throws SQLException {
        consulta = "INSERT INTO `banco` (`nombre`) VALUES ('" + banco + "');";
        return mngr.inserta_objeto(consulta);
    }
}
