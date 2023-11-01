package Collections;

public class DoubleNode {
    //Atributos
    private int Dato;
    private DoubleNode LigaD, LigaI;

    //Metodos
    public DoubleNode(int Dato) {
        this.Dato = Dato;
        this.LigaD = null;
        this.LigaI = null;
    }

    public DoubleNode() {
        this.Dato = 0;                  //POR DEFECTO
        this.LigaD = null;
        this.LigaI = null;

    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public DoubleNode getLigaD() {
        return LigaD;
    }

    public void setLigaD(DoubleNode LigaD) {
        this.LigaD = LigaD;
    }

    public DoubleNode getLigaI() {
        return LigaI;
    }

    public void setLigaI(DoubleNode LigaI) {
        this.LigaI = LigaI;
    }
}
