package Data;

import Collections.SimpleNode;

import javax.swing.*;

public class Stack {

    private SimpleNode Head;
    public int Limit, Top;

    public Stack (int length) {
        this.Limit = length - 1;
        this.Top = -1;
        this.Head = null;
    }

    public void PileUp(int dato) {
        SimpleNode X = new SimpleNode(dato);
        Top++;
        if (this.Head != null) X.setLiga(this.Head);
        this.Head = X;
    }

    public boolean EmptyStack() {
        return Top <= -1;
    }

    public boolean FullStack() {
        return Top == Limit;
    }
    public int PileDown() {
        SimpleNode P = Head;
        Top--;
        int r = Head.getDato();
        Head = Head.getLiga();
        P.setLiga(null);
        return (r);
    }

    public void FillStack(Stack PA) {
        int r;
        while (!PA.EmptyStack()) {
            r = PA.PileDown();
            PileUp(r);
        }
    }

    public void ShowStack() {
        SimpleNode aux = Head;
        String mostrar = "";
        while (aux != null) {
            mostrar += aux.getDato() + "\n";
            aux = aux.getLiga();

        }
        JOptionPane.showMessageDialog(null, mostrar);
        mostrar = "";
    }

    public boolean Search(int d) {
        Stack A = new Stack(this.Limit);
        boolean found = false;

        while ( Head.getDato() != d && !EmptyStack()) {
            A.PileUp(PileDown());
        }
        FillStack(A);
        if (Head.getDato() == d && !EmptyStack()) found = true;

        return found;
    }
}
