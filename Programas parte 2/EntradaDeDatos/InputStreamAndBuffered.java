import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamAndBuffered {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada de datos");
        //definicion de objeto para capturar entrada
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader bInput= new BufferedReader(input);
        //definicion de variables
        String captura;
        int numero;
        //solicitar un valor al usuario
        System.out.println("Introduce una palabra: ");
        captura=bInput.readLine();
        System.out.println("Introduce un numero: ");
        numero=Integer.parseInt(bInput.readLine());
        System.out.println("Dato introducido: "+captura);
        System.out.println("Numero introducido; "+numero);
    }
}
