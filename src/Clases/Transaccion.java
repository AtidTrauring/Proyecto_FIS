package Clases;

import java.util.Date;

public class Transaccion {
    private int transaccionID;
    public double monto;
    public Date fecha;

    public Transaccion(int transaccionID, double monto, Date fecha) {
        this.transaccionID = transaccionID;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getTransaccionID() {
        return transaccionID;
    }

    public void setTransaccionID(int transaccionID) {
        this.transaccionID = transaccionID;
    }

}
