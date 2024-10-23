package Generics;
//definicion de clase generica de Tipo (T)
public class ClaseGenerica<T> {
    //al definir la instancia se debe especificar el tipo
    //definimos la variable de tipo generico que almacena la clase
    T objeto;
    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
    //metodo para obtener el tipo de la clase
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName());
    }
}
