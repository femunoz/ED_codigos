## Problema 1: Conversión de decimal a binario

**Tiempo estimado: 10-12 minutos**
**Implementación requerida:** pila mediante arreglo.

Utiliza la clase PilaArreglo.

Escriba un programa en Java que reciba un número entero positivo y muestre su representación binaria.

Para realizar la conversión:

1. Divida sucesivamente el número por 2.
2. Apile el resto de cada división.
3. Desapile los restos para mostrarlos en el orden correcto.

Debe utilizar obligatoriamente la clase `PilaArreglo`.

No se permite utilizar:

- `Integer.toBinaryString()`.
- `Stack`, `Deque` u otra estructura equivalente de Java.
- Arreglos adicionales para almacenar los restos.

### Ejemplo

```text
Ingrese un número entero positivo: 25
Representación binaria: 11001
```

```text
Ingrese un número entero positivo: 8
Representación binaria: 1000
```

### Código inicial

```java
import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PilaArreglo pila = new PilaArreglo();

        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();

        // Complete el programa
    }
}
```

El programa debe utilizar al menos las operaciones:

```java
apilar()
desapilar()
estaVacia()
```

---

## Problema 2: Cancelación de caracteres consecutivos

**Tiempo estimado: 15-18 minutos**
**Implementación requerida:** pila mediante lista enlazada.

Escriba un programa en Java que reciba una cadena y elimine parejas de caracteres iguales que queden consecutivos.

Cada vez que dos caracteres iguales quedan juntos, ambos deben eliminarse. Este proceso debe continuar hasta que no sea posible realizar más eliminaciones.

Para resolver el problema debe utilizar obligatoriamente una pila implementada mediante una lista enlazada, correspondiente a la clase `PilaLista`.

### Ejemplo 1

```text
Entrada: abbaca
Salida: ca
```

El procesamiento es:

```text
abbaca → aaca → ca
```

### Ejemplo 2

```text
Entrada: abccba
Salida: cadena vacía
```

### Ejemplo 3

```text
Entrada: estructura
Salida: estructura
```

### Indicaciones

Para cada carácter de la cadena:

- Si la pila está vacía, apile el carácter.
- Si el carácter es igual al que se encuentra en el tope, desapile.
- Si son diferentes, apile el nuevo carácter.
- Al finalizar, muestre los caracteres restantes en su orden original.

Puede utilizar una segunda `PilaLista` para invertir el contenido antes de mostrar el resultado.

No se permite utilizar `Stack`, `Deque`, `LinkedList` ni métodos destinados a eliminar directamente los caracteres de la cadena.

### Código inicial

```java
import java.util.Scanner;

public class CancelarCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PilaLista pila = new PilaLista();

        System.out.print("Ingrese una cadena: ");
        String cadena = teclado.nextLine();

        // Complete el programa
    }
}
```

El programa debe utilizar las operaciones:

```java
apilar()
desapilar()
tope()
estaVacia()
```
