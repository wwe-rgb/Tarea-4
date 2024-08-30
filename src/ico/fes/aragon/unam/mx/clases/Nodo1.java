package ico.fes.aragon.unam.mx.clases;

public class Nodo1<T> {
    private T dato;
    private Nodo1<T> siguiente;


    public Nodo1() {
    }

    public Nodo1(T dato) {
        this.dato = dato;
    }

    public Nodo1(T dato, Nodo1<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo1<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }
}
