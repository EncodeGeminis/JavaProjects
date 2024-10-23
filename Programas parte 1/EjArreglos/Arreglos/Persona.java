package Arreglos;

public class Persona {
    private String nombre;
    //constructor de la clase
    public Persona(String nombre){
        this.nombre=nombre;
    }
    //metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }
}
