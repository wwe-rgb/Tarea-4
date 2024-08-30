package ico.fes.aragon.unam.mx.clases;

public class ListaLigada<T> {
    private Nodo1<T> head;
    private int tamanio;

    public ListaLigada() {
    }

    public void agregarAlFinal(T dato) {
        Nodo1<T> nuevo = new Nodo1<>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo1<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }


    }

    public void transversal() {
        Nodo1<T> aux = this.head;
        while (aux != null) {
            System.out.print(aux.getDato() + " --> ");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    public boolean estaVacia() {

        if (this.head == null) {

            System.out.println("esta vacia");
            return true;

        }

        System.out.println("no esta vacia");

        return false;

    }

    public void insertarAlInicio(T dato) {

        this.head = new Nodo1<>(dato, this.head);

    }

    public int getTamanio() {
        Nodo1 aux = this.head;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();


        }
        return contador;

    }

    public void agregarDespuesDe(Nodo1<T> referencia, T valor) {


        if (referencia != null) {

            Nodo1<T> nuevo = new Nodo1<>(valor);


            nuevo.setSiguiente(referencia.getSiguiente());
            referencia.setSiguiente(nuevo);


        }
    }

    public void eliminarElPrimero() {

        if (head != null) {

            head = head.getSiguiente();
        }
    }

    public int buscar(T valor) {
        Nodo1<T> nuevo = head;
        int posicion = 0;
        while (nuevo != null) {
            if (nuevo.getDato().equals(valor)) {
                return posicion;
            }
            nuevo = nuevo.getSiguiente();
            posicion++;
        }
        return -1;
    }

    public void actualizar(int posicion, T valor) {

        if (posicion <0 || posicion >= getTamanio()){

            System.out.println("Posicion invalida");
            return;
        }
        Nodo1<T> nuevo = head;
        for(int i = 0; i<posicion; i++){
            nuevo= nuevo.getSiguiente();
        }
        nuevo.setDato(valor);

    }

    public void eliminar(int posicion) {
        if (head == null || posicion < 0) {
            return;
        }
        if (posicion == 0) {
            head = head.getSiguiente();
            return;
        }

        Nodo1<T> actual = head;
        for (int i = 0; i < posicion - 1 && actual != null; i++) {
            actual = actual.getSiguiente();
        }

        if (actual == null || actual.getSiguiente() == null) {
            return;
        }

        actual.setSiguiente(actual.getSiguiente().getSiguiente());
    }


}
