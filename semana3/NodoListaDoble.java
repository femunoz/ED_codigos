public class NodoListaDoble {
    String nombre;
    NodoListaDoble sgte;
    NodoListaDoble ant;

    // __________________
    // |nombre|edad|sgte|->
    // ------------------

    public NodoListaDoble() {
        nombre = null;
        sgte = null;
        ant = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
