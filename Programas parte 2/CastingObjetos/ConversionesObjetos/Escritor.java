package ConversionesObjetos;

public class Escritor extends Empleados {
    final TipoEscritura tipoEscritura;
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscritura;
    }
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo de Escritura: "+tipoEscritura.getDescripcion();
    }
    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    public String getTipoEscrituraTexto(){
        return tipoEscritura.getDescripcion();
    }  
}
