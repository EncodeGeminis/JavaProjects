import Operaciones.Division;
import Operaciones.OperacionExcepcion;

public class App {
    public static void main(String[] args) {
        System.out.println("Manejo de excepciones");
        //Se crea un nuevo objeto de tipo Division
        Division division;
        try {
            division = new Division(140,0);
            division.imprimirOperacion();
        } catch (OperacionExcepcion e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("El programa continua");
    }
}
