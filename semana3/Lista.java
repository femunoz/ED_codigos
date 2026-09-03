public class Lista {
    NodoLista lista;

    public Lista() {
        lista = null;
    }

    public void add(String nombre, int edad) {

        NodoLista nvo = new NodoLista();
        nvo.nombre = nombre;
        nvo.edad = edad;

        if (lista == null) {
            lista = nvo;
            return;
        }

        nvo.sgte = lista;
        lista = nvo;

    }

    public void printLista() {
        NodoLista aux = lista;

        while (aux != null) {
            System.out.println(aux.nombre);
            System.out.println(aux.edad);
            aux = aux.sgte;
        }
    }

    static public void main(String args[]) {

        Lista l = new Lista();

        l.add("Josefina", 20);
        l.printLista();
        l.add("Nikolai", 19);
        l.printLista();
        l.add("Felipe", 45);
        l.printLista();
    }
}
