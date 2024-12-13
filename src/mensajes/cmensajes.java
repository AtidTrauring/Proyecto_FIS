package mensajes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class cmensajes {

    public static void message(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    public static void mistake(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void warning(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public static boolean validarCamposVacios(JTextField campo) {
        String texto = campo.getText().trim();
        if (texto.matches("\\d+")) {
            return true;
        } else {
            cmensajes.message("El campo no puede quedar vacio.", "Registro");
            return false;
        }
    }

    public static boolean validarLetras(JTextField campo) {
        String texto = campo.getText().trim();
        if (texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            return true;
        } else {
            cmensajes.message("Los caracteres no son permitidos. \nIngrese unicamente letras", "Registro");
            return false;
        }
    }

    public static boolean validarNumeros(JTextField campo) {
        String texto = campo.getText().trim();
        if (texto.matches("\\d+")) {
            return true;
        } else {
            cmensajes.message("El numero de telefono no es valido. \nIngrese unicamente numeros", "Registro");
            return false;
        }
    }

    public static boolean validarCorreo(JTextField campo) {
        String texto = campo.getText().trim();
        if (texto.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            return true;
        } else {
            cmensajes.message("El correo ingresado no es valido \nIngrese un formato valido", "Registro");
            return false;
        }
    }
    /*
    public static void mensaje(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    public static void error(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void advertencia(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
    }
     */
}
