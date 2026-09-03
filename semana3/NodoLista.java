public class NodoLista {
    String nombre;
    int edad;
    NodoLista sgte;

    // __________________
    // |nombre|edad|sgte|->
    // ------------------

    public NodoLista() {
        nombre = null;
        sgte = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
