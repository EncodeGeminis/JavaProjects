package ConversionesObjetos;

public class Empleados {
    protected String nombre;
    protected double sueldo;

    public Empleados(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    public String obtenerDetalles(){
        return "Nombre"+nombre+", sueldo: "+sueldo;
    }
    //metodos get y set 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
