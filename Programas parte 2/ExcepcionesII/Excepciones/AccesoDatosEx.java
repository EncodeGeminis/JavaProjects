package Excepciones;
//para utilizar como excepcion tiene que extender de Exception
//Check Exception usa Try-Catch
public class AccesoDatosEx extends Exception{
    //creamos un constructor
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
}
