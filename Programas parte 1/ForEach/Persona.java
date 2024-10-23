public class Persona {
    private final int idPersona;
    private String nombre;
    private static int contadorPersona;
    //constructor
    public Persona(String nombre){
        this.idPersona=++contadorPersona;
        this.nombre=nombre;
    }
    //metodos 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }
}
