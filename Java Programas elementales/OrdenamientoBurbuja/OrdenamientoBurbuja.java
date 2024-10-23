import java.util.Scanner;
public class OrdenamientoBurbuja {
    public static void main(String[] args) throws Exception {
        System.out.println("ordenamiento Metodo Burbuja");
        int nElementos, aux;
        nElementos=obtenerElementos();
        int[] numeros=crearArreglo(nElementos);
        llenarArreglo(numeros);
        ordenarArreglo(numeros);
        imprimirResultado(numeros, nElementos);
    }
    public static int obtenerElementos(){
        System.out.println("numero de Elementos del arreglo: ");
        Scanner leer=new Scanner(System.in);
        int nElementos=leer.nextInt();
        return nElementos;
    }
    public static int crearArreglo(int nElementos){
        return nElementos;
    }
    public static void llenarArreglo(){

    }
    public static void ordenarArreglo(){

    }
    public void imprimirResultados(int numeros, int nElementos){

    }


}
