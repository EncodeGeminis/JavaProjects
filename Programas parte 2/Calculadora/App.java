import java.util.Scanner;

import static Calculadora.Operaciones.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora");
        Scanner reader=new Scanner(System.in);
        //objeto de entrada de datos con Scanner
        System.out.println("Escribe un numero:");
        int numero=reader.nextInt();
        System.out.println("Escribe otro numero: ");
        int numero2=reader.nextInt();
        //impresion de resultados
        System.out.println("Resultado suma: "+sumar(numero, numero2));
        System.out.println("Resultado resta: "+restar(numero, numero2));
    }
}
