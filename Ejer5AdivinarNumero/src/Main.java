import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Ejercicio 5 Excepcion Java - Adivina el numero Secreto
public class Main {
    public static void main(String[] args) {
        //Crear un contador para el numero de intentos
        int cont = 4;
        //Generar un numero Aleatorio entre 1 y 500

        int numeroSecreto = ThreadLocalRandom.current().nextInt(1, 500);
        //Crear Scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes que adivinar un número entre 1 y 500.");

        while (true) {
            System.out.println(" Introduce el numero que estas pensando");

            try {
                int numUsuario = leer.nextInt();
                cont++;

                if (numeroSecreto < 1 || numUsuario > 500) {
                    System.out.println("Por favor ingresa un numero entre 1 y 500");

                } else if (numeroSecreto > numUsuario) {
                    System.out.println("El numero secreto es mayor al ingresado por teclado");

                } else if (numeroSecreto < numUsuario) {
                    System.out.println("El numero secreto es menor al ingresado por teclado");
                } else {
                    System.out.println("!Adivinaste el numero secreto, FELICITACIONES!!" + cont + "Intentos");
                    break;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Ingresa un numero valido para el juego");
                leer.next();
                cont++;
            }
        }
    }
}
