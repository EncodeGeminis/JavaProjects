public class Persona {
    //definicion de atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    //constructor 
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.eliminado=eliminado;
    }
    //Metodos Get y Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    } 
    /*
     * //metodo toString
    public String toString(){
        return "nombre:"+nombre+" sueldo:"+sueldo+" Eliminado:"+eliminado;
    } 
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + "]";
    }
    
}
