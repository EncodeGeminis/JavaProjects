public class Persona {
    //atributos del objeto se asocian con el objeto
    private int idPersona;
    private String nombre;
    //contexto estatico
    private static int contadorPersona;//se asocia con la clase
    //constructor vacio
    public Persona(){}
    //constructor con pasada de argumentos
    public Persona(String nombre){
        //se aumenta el contador estatico para que no se cree otro atributo
        this.idPersona = ++contadorPersona;
        this.nombre=nombre;
    }
    //Metodos get y set
    /*
        public void setIdPersona(int idPersona){
        this.idPersona=idPersona;}
     */
    public int getIdPersona(){
        return idPersona;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String nombre(){
        return nombre;
    }
    //metodos
    //se crea un metodo para modificar el contador
    //de tipo estatico 
    public static int getContadorPersonas(){
        return contadorPersona;
    }
    //metodo to string
    public String toString(){
        return "idPersona:"+idPersona+" nombre:"+nombre+" contador:"+contadorPersona;
    }
}
