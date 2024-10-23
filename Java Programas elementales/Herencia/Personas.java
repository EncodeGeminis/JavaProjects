public class Personas {
    private String nombre;
    private int edad;
    private String correo;

    public Personas(String nombre, int edad, String correo){
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCorreo(){
        return correo;
    }
    public String toString(){
        return "\nnombre: "+nombre+"\nEdad: "+"\nCorreo: "+correo;
    }
}
