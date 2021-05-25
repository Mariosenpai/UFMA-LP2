
public class Ticket {

    private int ID;
    private int valor;
    private boolean pago;

    static int numtick = 0;

    public Ticket() {

        this.ID = numtick++;
        this.valor = 2;
        this.pago = false;

    }

    public int getValor() {
        return valor;
    }

    public int getID() {
        return ID;
    }

    public boolean getPago() {
        return pago;
    }

    public void setPago() {
        this.pago = true;
    }

}