import java.util.InputMismatchException;
import java.util.Scanner;
// Ejercicio 3 Excepciones
/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

Ejercicio 4 Excepciones
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones.



 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*
        String num1;
        String num2;

        System.out.println("Por favor Ingrese el primer numero");
        num1 = leer.next();
        System.out.println("Por favor Ingrese el primer numero");
        num2 = leer.next();

        // Convierte las cadenas a números enteros utilizando parseInt()
        try {
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            // Verifica si el segundo número es cero (división por cero)

            if (numero2 == 0) {
                System.out.println("No se puede dividir por cero");
            } else {
                // Realiza la división y muestra el resultado
                int resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Ingrese números válidos en forma de cadena.");

         */

        try {
            System.out.print("Ingresa un número: ");
            int numero = leer.nextInt();
            System.out.println("Número ingresado: " + numero);

            System.out.print("Ingresa una cadena para convertir a entero: ");
            String cadena = leer.next();
            int entero = Integer.parseInt(cadena);
            System.out.println("Cadena convertida a entero: " + entero);


            //Al ingresar un numero con algun caracter especial (#,$,{,=?) marca error tipo InputMismatchException.

            //System.out.print("Ingresa un divisor para dividir 10 por él: ");
            //int divisor = leer.nextInt();
            //int resultado = 10 / divisor;
            //System.out.println("Resultado de la división: " + resultado);

        //} catch (InputMismatchException e) {
            //System.err.println("Error: Debes ingresar un número válido.");
        } catch (NumberFormatException e) {
            System.err.println("Error: No se pudo convertir la cadena a entero.");
       // } catch (ArithmeticException e) {
            //System.err.println("Error: División por cero no permitida.");
        } finally {
            // Cierra el scanner para liberar recursos.
            leer.close();
        }
    }
}
