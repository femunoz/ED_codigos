import java.util.EmptyStackException;

/**
 * Implementacion del TDA pila mediante un arreglo.
 */
public class PilaArreglo {
    private static final int MAX_ELEM = 100;

    private final Object[] arreglo;
    private int tope;

    /**
     * Construye una pila vacia con capacidad para MAX_ELEM elementos.
     */
    public PilaArreglo() {
        arreglo = new Object[MAX_ELEM];
        tope = -1;
    }

    /**
     * Inserta un elemento en el tope de la pila.
     *
     * @param x elemento que se desea apilar
     * @throws IllegalStateException si la pila esta llena
     */
    public void apilar(Object x) {
        if (tope + 1 >= MAX_ELEM) {
            throw new IllegalStateException("Overflow: la pila esta llena.");
        }

        tope++;
        arreglo[tope] = x;
    }

    /**
     * Retorna y elimina el elemento ubicado en el tope.
     *
     * @return elemento retirado de la pila
     * @throws EmptyStackException si la pila esta vacia
     */
    public Object desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        Object x = arreglo[tope];
        arreglo[tope] = null;
        tope--;
        return x;
    }

    /**
     * Retorna el elemento del tope sin eliminarlo.
     *
     * @return elemento ubicado en el tope
     * @throws EmptyStackException si la pila esta vacia
     */
    public Object tope() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return arreglo[tope];
    }

    /**
     * Indica si la pila no contiene elementos.
     *
     * @return true si la pila esta vacia; false en caso contrario
     */
    public boolean estaVacia() {
        return tope == -1;
    }
}
