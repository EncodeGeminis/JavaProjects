public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estructuras");
        imprimir(2,3,4,5,6,7,9);
        variosParametros("usuario",false, 12,12,14);
    }
    public static void imprimir(int... numeros){
        int elemento;
        for(int i=0;i<numeros.length;i++){
            elemento=numeros[i];
            System.out.println("numero: "+elemento);
        }
        for(int numero: numeros){
            System.out.println("numero: "+numero);
        }
    }
    public static void variosParametros(String nombre, boolean validacion, int... numeros){
        System.out.println(nombre);
        System.out.println(validacion);
        for(int numero: numeros){
            System.out.println(numero);
        }
    }
}