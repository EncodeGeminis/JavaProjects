import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int arreglo[],nElementos, aux,min;
        //pedir los elementos del arreglo
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de elementos del arreglo"));
        arreglo =new int[nElementos];
        //rellenando el arreglo
        System.out.println("Rellenando el arreglo:");
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+"-Escribe un numero: ");
            arreglo[i]=leer.nextInt();
        }
        //Ordenamiento por seleccion 
        for(int i=0;i<nElementos;i++){
            min=i; //elemento menor del arreglo
            for(int j=(i+1);j<nElementos;j++){
                if(arreglo[j]<arreglo[min]){
                    min=j;
                }
            }
            aux=arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux;
        }
            System.out.println("Arreglo ordneado creciente:\n");
            for(int i=0;i<nElementos;i++){
                System.out.print(arreglo[i]+" - ");
            }
            System.out.println("\nOrden decreciente\n");
            for(int i=(nElementos-1);i>=0;i--){
                System.out.print(arreglo[i]+" - ");
            }
    }
}


