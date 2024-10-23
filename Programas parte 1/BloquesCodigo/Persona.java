public class Persona {
    //definicion de atributos
    private final int idPersona;
    private static int contadorPersona;
    //bloque de codigo static
    static{
        //no se pueden usar variables no estaticas
        System.out.println("ejecucion bloque estatico");
        contadorPersona=10;
    }
    //bloque anonimo
    //se copia a cada uno de los objetos que son creados
    {
        System.out.println("Ejecucion bloque anonimo");
        this.idPersona=++contadorPersona;
    }
    //constructor de la clase
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    public int getIdPersona(){
        return idPersona;
    }
}
