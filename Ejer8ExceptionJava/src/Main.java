import static Entidades.ClaseUno.metodo;

// Ejercicio 8 Excepciones - Java
// Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
public class Main {
    public static void main(String[] args) {

        try {
                System.out.println (metodo());
            }catch(Exception e) {
                System.err.println("Excepcion en metodo()") ;
                e.printStackTrace();
            }
        }
    }


        /*
        try {
            System.out.println(metodo());

        } catch (Exception e) {
            System.err.println("Excepcion en el metodo()");
            e.printStackTrace();
        }
    }
}
 */


