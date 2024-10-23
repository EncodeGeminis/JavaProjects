import Generics.ClaseGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Manejo de Colecciones Genericas");
        //prueba de Manejo de Genericos
        //creando un objeto de tipo integer con la clase generica
        ClaseGenerica<Integer> objetoInteger= new ClaseGenerica<Integer>(500);
        //comprobando el tipo que almacena la clase generica.
        objetoInteger.obtenerTipo();
        //creando un objeto de tipo String con la clase generica
        ClaseGenerica<String> objetoString= new ClaseGenerica<String>("GeminisString");
        //comprobando el tipo que almacena el objeto
        objetoString.obtenerTipo();
        //no se puede aplicar a tipos primitivos
        //ClaseGenerica<int> objetoInt=new ClaseGenerica<>(450);
    }
}
