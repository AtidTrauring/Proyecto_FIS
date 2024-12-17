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
        consulta = "SELECT `nombre` FROM `banco` WHERE nombre = '" + nombre + "';";
        return mngr.buscarValor(consulta);
    }

    public String buscaCliente(String CURP) throws SQLException {
        consulta = "SELECT curp FROM `usuario` WHERE curp = '" + CURP + "'";
        return mngr.buscarValor(consulta);
    }

    public String buscaIdCliente(String CURP) throws SQLException {
        consulta = "SELECT `id_usuario` FROM `usuario` WHERE curp = '" + CURP + "'";
        return mngr.buscarValor(consulta);
    }

    public String buscaDireccion(String calle, String numInt, String numExt, String Barrio, String Municipio) throws SQLException {
        consulta = "SELECT id_direccion FROM `direccion` WHERE calle = '" + calle + "' AND numInt = '" + numInt + "' AND numExt = '" + numExt + "' AND barrio = '" + Barrio + "' AND municipio = '" + Municipio + "';";
        return mngr.buscarValor(consulta);
    }

    //nombre, apeP, apeM, email, confEmail, telefono, curp, password, user
    public boolean insertaUsuario(String[] datosCliente, String id_Usuario) throws SQLException {
        consulta = "INSERT INTO `registro`(`usuario`, `contraseña`, `id_usuario`) VALUES ('" + datosCliente[8] + "','" + datosCliente[7] + "','" + id_Usuario + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean insertaCliente(String[] datosCliente, String id_Dir) throws SQLException {
        consulta = "INSERT INTO `usuario`(`nombre`, `ap_Pat`, `ap_Mat`, `correoElectronico`, `curp`, `id_direccion`) "
                + "VALUES ('" + datosCliente[0] + "','" + datosCliente[1] + "','" + datosCliente[2] + "','" + datosCliente[3] + "','" + datosCliente[6] + "','" + id_Dir + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean insertaTelefono(String[] datosCliente, String id_Usuario) throws SQLException {
        consulta = "INSERT INTO `num_telefonico`(`numero`, `id_usuario`) VALUES ('" + Long.valueOf(datosCliente[5]) + "','" + id_Usuario + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean insertaDireccion(String calle, String numInt, String numExt, String Barrio, String Municipio) throws SQLException {
        consulta = "INSERT INTO `direccion`(`calle`, `numExt`, `numInt`, `barrio`, `municipio`) VALUES ('" + calle + "','" + numExt + "','" + numInt + "','" + Barrio + "','" + Municipio + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean insertaBanco(String banco) throws SQLException {
        consulta = "INSERT INTO `banco` (`nombre`) VALUES ('" + banco + "');";
        return mngr.inserta_objeto(consulta);
    }

    //-------------------------------------------------------------------------------------
    public String busca_saldo(String nombreUsuario) throws SQLException {
        consulta = "SELECT cuenta.saldo FROM cuenta INNER JOIN ba_us_cu  ON cuenta.id_cuenta = ba_us_cu.id_cuenta INNER JOIN usuario ON ba_us_cu.id_usuario = usuario.id_usuario WHERE usuario.nombre = '"
                + nombreUsuario + "';";
        return mngr.buscarValor(consulta);
    }

    // Seccion CAMPI
    public String busca_Usuario(String User, String contra) throws SQLException {
        consulta = "SELECT Id_Usuario FROM Registro WHERE Usuario = '" + User
                + "' AND contraseña = '" + contra + "';";
        return mngr.buscarValor(consulta);
    }

    public ArrayList<String[]> busca_Cuenta(String Id_User) throws SQLException {
        // Consulta para obtener el número de cuenta, nombre del banco y saldo disponible
        consulta = "SELECT "
                + "c.id_cuenta AS Id_Cuenta, " // Añadido el id_cuenta
                + "c.numdecuenta AS Numero_Cuenta, "
                + "b.nombre AS Banco, "
                + "c.saldo AS Saldo_Disponible "
                + "FROM usuario u "
                + "JOIN ba_us_cu ba ON u.id_usuario = ba.id_usuario "
                + "JOIN cuenta c ON ba.id_cuenta = c.id_cuenta "
                + "JOIN banco b ON ba.id_banco = b.id_banco "
                + "WHERE u.id_usuario = " + Id_User + ";";
        return mngr.buscar_para_Trans(consulta);
    }

    public ArrayList<String[]> busca_otras_Cuentas(String Id_User) throws SQLException {
        // Consulta para obtener el número de cuenta, nombre del banco y beneficiario
        consulta = "SELECT "
                + "c.id_cuenta AS Id_Cuenta, "
                + "c.numdecuenta AS Numero_Cuenta, "
                + "b.nombre AS Banco, "
                + "r.Usuario AS Beneficiario, "
                + "c.saldo AS Saldo "
                + "FROM usuario u "
                + "JOIN ba_us_cu ba ON u.id_usuario = ba.id_usuario "
                + "JOIN cuenta c ON ba.id_cuenta = c.id_cuenta "
                + "JOIN banco b ON ba.id_banco = b.id_banco "
                + "JOIN Registro r ON u.id_usuario = r.id_usuario "
                + "WHERE u.id_usuario != " + Id_User + ";"; // Filtra por usuarios diferentes al proporcionado
        return mngr.buscar_para_otras_Trans(consulta);
    }

    public boolean actualiza_Mi_Saldo(String Id, double saldo) throws SQLException {
        consulta = "UPDATE banco.Cuenta SET Saldo = " + saldo + " " + "WHERE Cuenta.Id_Cuenta = " + Id + ";";
        return mngr.actualiza_objeto(consulta);
    }

    public boolean actualiza_Su_Saldo(String Id, double saldo) throws SQLException {
        consulta = "UPDATE banco.Cuenta SET Saldo = " + saldo + " " + "WHERE Cuenta.Id_Cuenta = " + Id + ";";
        return mngr.actualiza_objeto(consulta);
    }

    public ArrayList<String[]> buscar_cliente(String valor) throws SQLException {
        consulta = "SELECT CONCAT(us.nombre, ' ', us.ap_Pat, ' ', us.ap_Mat) AS Cliente FROM usuario us WHERE us.curp = '" + valor + "'";
        System.out.println(consulta);
        return mngr.busquedas(consulta);
    }

    public ArrayList<String[]> mostraridusuario(String valor) throws SQLException {
        consulta = "SELECT us.id_usuario FROM usuario us WHERE us.curp = '" + valor + "'";
        return mngr.busquedas(consulta);
    }

    public ArrayList<String[]> mostrarusuario(String valor) throws SQLException {
        consulta = "SELECT CONCAT(us.nombre, ' ', us.ap_Pat, ' ', us.ap_Mat) AS Cliente FROM usuario us WHERE us.id_usuario = '" + valor + "'";
        return mngr.busquedas(consulta);
    }

    public ArrayList<String[]> mostrarmonto(String valor) throws SQLException {
        consulta = "SELECT c.monto FROM credito c WHERE c.id_usuario = '" + valor + "'";
        return mngr.busquedas(consulta);
    }

    public ArrayList<String[]> mostrarsaldo(String valor) throws SQLException {
        consulta = "SELECT c.saldo FROM ba_us_cu bc INNER JOIN usuario u ON bc.id_usuario = u.id_usuario INNER JOIN cuenta c ON bc.id_cuenta = c.id_cuenta WHERE u.id_usuario = '" + valor + "'";
        return mngr.busquedas(consulta);
    }

    public boolean insertar_telefonos(String telocal, String cel, String iduser) throws SQLException {
        consulta = "INSERT INTO num_telefonico(id_telefono, tel_local, numero, id_usuario) VALUES (NULL, '" + telocal + "', '" + cel + "', '" + iduser + "');";
        return mngr.insertar(consulta);
    }

    public boolean insertar_credito(String idus, double monto) throws SQLException {
        consulta = "INSERT INTO credito (id_credito, id_usuario, monto) VALUES (NULL, '" + idus + "', '" + monto + "');";
        return mngr.insertar(consulta);
    }

    public ArrayList<String[]> buscar_credito(String valor) throws SQLException {
        consulta = "SELECT cr.monto FROM credito cr WHERE id_usuario = " + valor;
        System.out.println(consulta);
        return mngr.busquedas(consulta);
    }

    public boolean actualizar_saldo(String nuevosaldo, String idus) throws SQLException {
        consulta = "UPDATE cuenta c INNER JOIN ba_us_cu bc ON c.id_cuenta = bc.id_cuenta INNER JOIN usuario u ON bc.id_usuario = u.id_usuario SET c.saldo = '" + nuevosaldo + "' WHERE u.id_usuario = '" + idus + "'";
        System.out.println(consulta);
        return mngr.actualizar(consulta);
    }
}
