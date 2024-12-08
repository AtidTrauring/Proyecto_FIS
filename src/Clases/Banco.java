package Clases;

public class Banco {
    private int bancoID;
    private String nombre;

    public Banco(int bancoID, String nombre) {
        this.bancoID = bancoID;
        this.nombre = nombre;
    }

    public int getBancoID() {
        return bancoID;
    }

    public void setBancoID(int bancoID) {
        this.bancoID = bancoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCliente(Cliente cltn){
        
    }
}
