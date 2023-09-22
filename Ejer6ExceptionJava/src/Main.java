/*
Ejercicio 6 Exception - Java

Dado el método metodoA de la clase A, indique:

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
 */
public class Main {
    public static void main(String[] args) {

        /*
        class A {
public void metodoA() {
sentencia_a1
sentencia_a2
try {
sentencia_a3
sentencia_a4
} catch (MioException e){
sentencia_a6
 }
sentencia_a5
 }
}

a) Si se produce la excepción MioException:

sentencia_a1 se ejecutará.
sentencia_a2 se ejecutará.
sentencia_a3 se ejecutará.
Si se produce la excepción MioException dentro de sentencia_a3, entonces el flujo de control se transferirá al bloque catch.
sentencia_a6 se ejecutará.
Independientemente de si se produce la excepción o no, después del bloque try-catch, sentencia_a5 se ejecutará.
Entonces, el orden de ejecución sería: a1 -> a2 -> a3 (si no hay excepción) o a1 -> a2 -> a3 -> a6 (si se produce la excepción) -> a5.

b) Si no se produce la excepción MioException:

sentencia_a1 se ejecutará.
sentencia_a2 se ejecutará.
sentencia_a3 se ejecutará.
Si no se produce la excepción MioException en sentencia_a3, entonces no se ejecutará el bloque catch y el flujo de control pasará directamente después del bloque try-catch.
sentencia_a5 se ejecutará.
En este caso, el orden de ejecución sería: a1 -> a2 -> a3 -> a5.

         */

    }
}
/*
Ejercicio 7 Capturar excepciones

Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
 sentencia_b1
try {
 sentencia_b2
} catch (MioException e){
 sentencia_b3
}
finally
 sentencia_b4
 }
}

a) Si se produce la excepción MioException:

Se ejecuta la sentencia sentencia_b1.
Luego, se ejecuta la sentencia sentencia_b2.
Como se produce la excepción MioException en sentencia_b2, se salta directamente a la sección catch.
Se ejecuta la sentencia sentencia_b3 en el bloque catch.
Después de ejecutar la sentencia sentencia_b3 en el bloque catch, se ejecuta la sentencia sentencia_b4 en el bloque finally.
En resumen, el orden de ejecución en caso de que se produzca la excepción MioException sería: sentencia_b1, sentencia_b2, sentencia_b3, sentencia_b4.

b) Si no se produce la excepción MioException:

Se ejecuta la sentencia sentencia_b1.
Luego, se ejecuta la sentencia sentencia_b2.
Como no se produce la excepción MioException, se omite el bloque catch y se pasa directamente al bloque finally.
Se ejecuta la sentencia sentencia_b4 en el bloque finally.
En resumen, el orden de ejecución en caso de que no se produzca la excepción MioException sería: sentencia_b1, sentencia_b2, sentencia_b4. El bloque catch se omite en este caso porque la excepción no se lanzó.

 */
