import java.util.Scanner;

public class MetodoScanner {
    public static void main(String[] args) {
        System.out.println("Utilizando Scanner");
        String palabra=null;
        int numero=0;
        // se define el objeto reader de tipo Scanner
        Scanner reader = new Scanner(System.in);
        // ejemplo utilizando un ciclo while
        while (!"salir".equals(palabra)) {
            // se introduce una palabra de tipo String
            System.out.println("Introduce una palabra");
            palabra = reader.nextLine();
            // se introduce un numero tipo entero
            System.out.println("Introduce un numero");
            numero = reader.nextInt();
            System.out.println("La palabra es: " + palabra);
            System.out.println("El numero es: " + numero);
        }
    }
}
