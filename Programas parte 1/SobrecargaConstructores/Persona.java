public class Persona {
    //atributos
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    //constructores
    private Persona(){
        this.idPersona= ++contadorPersonas;
    }
    public Persona(String nombre, int edad){
        this();//manda a llamar al construtor vacio privado
        this.nombre=nombre;
        this.edad=edad;
    }
    //metodos get y set
    public int getIdPersona() {
        return idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
