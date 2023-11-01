package Collections;

public class SimpleNode {
    private int Dato;
    private SimpleNode Liga;

    //METODOS
    //Constructor
    public SimpleNode(int dato) {
        this.Dato = dato;
        this.Liga = null;
    }

    public SimpleNode() {
        this.Dato = 0;
        this.Liga = null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }

    public SimpleNode getLiga() {
        return Liga;
    }

    public void setLiga(SimpleNode liga) {
        Liga = liga;
    }
}
