import com.geminis.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Matriz");
        // creacion de una matriz
        int[][] edades;
        // inicializacion de la matriz
        edades = new int[2][2];
        // instanciar los valores de la matriz
        edades[0][0] = 100;
        edades[0][1] = 200;
        edades[1][0] = 300;
        edades[1][1] = 230;
        // imprimir la matriz
        System.out.println("valor en: 0,0: " + edades[0][0]);
        System.out.println("valor en: 0,1: " + edades[0][1]);
        System.out.println("valor en: 1,0: " + edades[1][0]);
        System.out.println("valor en: 1,1: " + edades[1][1]);
        // matriz de objetos de tipo persona
        // Declarar e instanciar la matriz de objects
        Persona[][] personas = new Persona[1][2];
        // inicializar los valores de la matriz
        personas[0][0] = new Persona("Geminis");
        personas[0][1] = new Persona("Acuario");
        // imprimir los valores
        System.out.println("valor en (0,0): " + personas[0][0]);
        System.out.println("valor en (0,1): " + personas[0][1]);
        // recorrer el arreglo con ciclo for
        // este ciclo for controla las filas
        for (int fila = 0; fila < personas.length; fila++) {
            // ciclo for controla las columnas
            for (int columna = 0; columna < personas[fila].length; columna++) {
                System.out.println("valor en: " + fila + " - " + columna + " : " + personas[fila][columna]);
            }
        }
    }
}