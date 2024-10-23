package datos;

public interface AccesoDatos {
    //cualquier variable se toma como constante
    //se agrega public static por default sin escribirlo
    int MAX_REGISTROS=10;
    //los metodos tambien tienen unamodificacion por defecto
    //son public y abstract
    void insertar();
    public abstract void listar();
}
