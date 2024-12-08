package Clases;
public class Cuenta {
    private int cuentaID;
    public String numeroCuenta;
    public float saldo;

    public Cuenta(int cuentaID, String numeroCuenta, float saldo) {
        this.cuentaID = cuentaID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getCuentaID() {
        return cuentaID;
    }

    public void setCuentaID(int cuentaID) {
        this.cuentaID = cuentaID;
    }
    
    
}
