Para que ambos puedan resolverse en un máximo total de 30 minutos, conviene entregar implementadas las clases `PilaArreglo` y `PilaLista`. Los estudiantes deben desarrollar únicamente el algoritmo que usa cada TDA.

## Problema 1: Invertir una palabra

**Tiempo estimado: 10-12 minutos**

Escriba un programa en Java que reciba una palabra y muestre sus caracteres en orden inverso.

Para resolver el problema debe utilizar obligatoriamente una pila implementada mediante un arreglo, correspondiente a la clase `PilaArreglo` estudiada en clases.

No se permite utilizar:

- `Stack`, `Deque` o `ArrayList`.
- Métodos como `reverse()`.
- Recursividad.

### Ejemplo

```text
Ingrese una palabra: algoritmo
Palabra invertida: omtirogla
```

### Indicaciones

1. Recorra la palabra de izquierda a derecha.
2. Apile individualmente cada carácter.
3. Desapile los caracteres para construir o mostrar el resultado invertido.

El programa debe utilizar las operaciones:

```java
apilar()
desapilar()
estaVacia()
```

### Código inicial

```java
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PilaArreglo pila = new PilaArreglo();

        System.out.print("Ingrese una palabra: ");
        String palabra = teclado.nextLine();

        // Complete el programa
    }
}
```

---

## Problema 2: Verificar paréntesis balanceados

**Tiempo estimado: 15-18 minutos**

Escriba un programa en Java que reciba una expresión y determine si sus paréntesis están correctamente balanceados.

Para resolver el problema debe utilizar obligatoriamente una pila implementada mediante una lista enlazada, correspondiente a la clase `PilaLista` estudiada en clases.

Solo es necesario considerar los caracteres `(` y `)`. Los demás caracteres deben ignorarse.

Una expresión está balanceada cuando:

- Cada paréntesis de cierre tiene un paréntesis de apertura correspondiente.
- No quedan paréntesis de apertura almacenados al terminar el recorrido.

No se permite utilizar `Stack`, `Deque`, `LinkedList` ni otra estructura equivalente de Java.

### Ejemplos

```text
Ingrese una expresión: (a+b)*(c-d)
La expresión está balanceada.
```

```text
Ingrese una expresión: ((a+b)*c
La expresión no está balanceada.
```

```text
Ingrese una expresión: a+b)*(c-d)
La expresión no está balanceada.
```

### Indicaciones

Al recorrer la expresión:

- Si encuentra `(`, debe apilarlo.
- Si encuentra `)`, debe desapilar un elemento.
- Si encuentra `)` y la pila está vacía, la expresión es incorrecta.
- Al finalizar, la expresión solamente está balanceada si la pila está vacía.

El programa debe utilizar las operaciones:

```java
apilar()
desapilar()
estaVacia()
```

### Código inicial

```java
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PilaLista pila = new PilaLista();

        System.out.print("Ingrese una expresión: ");
        String expresion = teclado.nextLine();

        boolean balanceada = true;

        // Complete el programa
    }
}
```

Estos problemas pueden resolverse en aproximadamente **25-30 minutos en total**, siempre que las implementaciones de `PilaArreglo`, `PilaLista` y `NodoLista` sean entregadas previamente. Si los estudiantes también debieran implementar ambas pilas desde cero, el tiempo sería insuficiente.
