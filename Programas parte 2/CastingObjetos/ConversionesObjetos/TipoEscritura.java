package ConversionesObjetos;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura Digital");
    private final String descripcion;

    //definir constructor
    private TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
