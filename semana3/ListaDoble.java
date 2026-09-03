public class ListaDoble {
    NodoListaDoble lista;

    public ListaDoble() {
        lista = null;
    }

    public void add(String nombre, int edad) {

        NodoListaDoble nvo = new NodoListaDoble();
        nvo.nombre = nombre;

        if (lista == null) {
            lista = nvo;
            return;
        }

        lista.ant = nvo;
        nvo.sgte = lista;
        lista = nvo;

    }

    public void printLista() {
        NodoListaDoble aux = lista;

        while (aux != null) {
            System.out.println(aux.nombre);

            aux = aux.sgte;
        }
    }

    // TAREA: Escribir un printListaReversa
    // Imprimir la lista desde el fin al ppio.

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
