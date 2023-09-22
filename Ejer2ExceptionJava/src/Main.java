/*
Ejercicio 2 Excepciones Java
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
public class Main {
    public static void main(String[] args) {
        int edad[] = {12, 22, 32, 45};

        try { System.out.println("La edad en la posicion 4 es: " + edad [5]);

        }
        catch (Exception e){
            System.out.println("Intentó acceder a un indice que no existe");
        }
    }
}
