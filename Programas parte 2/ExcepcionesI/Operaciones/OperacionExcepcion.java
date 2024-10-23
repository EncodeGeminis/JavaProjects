package Operaciones;
//clase que extiende la excepcion
public class OperacionExcepcion extends Exception {
    //constructor con el mensaje que enviara la excepcion
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
