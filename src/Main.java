import java.util.Scanner;
/*Crea una clase llamada EdadNoValidaException que extienda de Exception.Luego, haz una clase Persona
que tenga un metodo setEdad(int edad) que lance esa excepción si la edad es menor de 0 o mayor de 120.
Haz un pequeño programa que pruebe a crear una persona y le asigne una edad incorrecta para ver que salta la excepción.*/

public class Main {
    public static void main(String[] args) {

    boolean ctrl = true;
        do {
            System.out.println("Introduce la edad de la persona: ");
            Scanner sc = new Scanner(System.in);
            int edad = sc.nextInt();

            Persona person = new Persona();

            //ejecuta el metodo setEdad que puede devolver una excepción del tipo EdadNoValidaException
            // --> lo que hace esta excepcion es devolver un mensaje
            try {
                person.setEdad(edad);
                ctrl=false;                            //si el metodo no lanza una excepcion salimos de main
            } catch (EdadNoValidaException e) {
                System.out.println(e.getMessage());         // si el metodo ha lanzado la excepcion imprimimos solo su mensaje
            }
        } while (ctrl);
    } //end main
}//end class