package Clases;

import connection.cconnector;

public class mainClass {

    public static void main(String[] args) {
        cconnector cn = new cconnector();
        cn.conectar();
    }
}
