package datos;

import Excepciones.AccesoDatosEx;

public interface AccesoDatos {
    //cualquier variable se toma como constante
    //se agrega public static por default sin escribirlo
    int MAX_REGISTROS=10;
    //los metodos tambien tienen unamodificacion por defecto
    //son public y abstract
    void insertar() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    //metodo simular error
    public abstract void simularError(boolean simularError);
}
