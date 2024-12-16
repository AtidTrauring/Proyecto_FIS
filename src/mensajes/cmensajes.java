package mensajes;

import javax.swing.JLabel;
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

    public static boolean validaCURP(String curp, JLabel jlvalidacurp) {
        if (curp.matches("^[A-Z0-9]{18}$")) {
            jlvalidacurp.setText("CURP Valida");
            return true;
        } else {
            cmensajes.warning("Debe de ingresar 18 valores alfanumericos en MAYUSCULA", "Valida CURP");
            return false;
        }
    }

    public static boolean validaTelefonos(String local, String cel) {
        if (local.matches("^[0-9]{10}$") && cel.matches("^[0-9]{10}$")) {
            //jltelefonos.setText("Valido");
            return true;
        } else {
            //jltelefonos.setText("Solo 10 números en cada recuadro");
            return false;
        }
    }

    public static boolean validaCredito(String idus, String cel, JLabel jltelefonos) {
        if (idus.matches("^[0-9]{10}$") && cel.matches("^[0-9]{10}$")) {
            jltelefonos.setText("Valido");
            return true;
        } else {
            jltelefonos.setText("Solo 10 números en cada recuadro");
            return false;
        }
    }

    public static boolean validaRetiro(String sacar) {
        if (sacar.matches("[0-9]+")) {
            return true;
        } else {
            cmensajes.mistake("Ingresa solo números", "Sacar dinero");
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
