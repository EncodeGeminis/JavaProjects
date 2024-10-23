import java.util.Scanner;
public class Calculadora {
    private int[] numeros;
//definiendo el constructor
   
    public void inputNumeros(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribe cuantos elementos vas a utilizar: ");
        int elementos=leer.nextInt();
        numeros=new int[elementos];
        for(int i=0;i<elementos;i++){
            numeros[i]=leer.nextInt();
        }
    }
    public int sumar(){
        int suma=0;
        for(int numeros: numeros){
            suma+=numeros;
        }
        return suma;
    }
    public int restar(){
        int resta=0;
        for(int numeros: numeros){
            resta-=numeros;
        }
        return resta;
    }
    public int multiplicar(){
        int mult=0;
        for(int numeros: numeros){
            mult*=numeros;
        }
        return mult;
    }
    public double dividir(int numero, int numero2){
        return numero/numero2;
    }
}
