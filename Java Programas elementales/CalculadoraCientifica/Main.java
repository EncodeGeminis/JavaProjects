import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        System.out.println("Calculadora");
        Calculadora operacion=new Calculadora();
        CalculadoraCientifica operacion2=new CalculadoraCientifica();
        System.out.println("menu");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Calcular Seno");
        System.out.println("6-Calcular Coseno");
        System.out.println("7-Calcular Tangente");
        System.out.println("ELije una opcion");
        int eleccion=leer.nextInt(); 
        switch (eleccion) {
            case 1:
            
                operacion.inputNumeros();
                System.out.println(operacion.sumar());
            break;
            case 2:
                
                operacion.inputNumeros();
                System.out.println(operacion.restar());
            break;
            case 3:
            operacion.inputNumeros();    
            System.out.println(operacion.multiplicar());
            break;
            case 4:
                System.out.println("escribe el primer valor: ");
                int numero=leer.nextInt();
                System.out.println("Escribe el segundo valor: ");
                int numero2=leer.nextInt();
                System.out.println(operacion.dividir(numero,numero2));
            break;
            case 5:
                System.out.println("introduce el valor en grados: ");
                int sen=leer.nextInt();
                operacion2.calcularSeno(sen);
            break;
            case 6:
                System.out.println("introduce el valor en grados: ");
                int cos=leer.nextInt();
                operacion2.calcularCoseno(cos);
            break;
            case 7:
                System.out.println("introduce el valor en grados: ");
                int tan=leer.nextInt();
                operacion2.calcularTangente(tan);
            break;
            default:
            System.out.println("Error, la operacion no existe");
                break;
        }
    }
}
