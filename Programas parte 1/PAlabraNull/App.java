public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uso de la palabra null");
        //se define un objeto de tipo persona
        Persona persona1= new Persona("Geminis");
        System.out.println("persona1: "+persona1.obtenerNombre());
        //se crea un objeto de tipo persona que apunta a persona1
        Persona persona2=persona1;//las dos variables apuntan al mismo objeto
        //el objeto cotiene los metodos y atributos de Persona
        System.out.println("persona2: "+persona2.obtenerNombre());
        //utilizando null ya no apunta al objeto Persona
        persona1=null;
        if(persona1 != null){
        System.out.println("persona1 con null:"+persona1.obtenerNombre());
        }
        else{
        System.out.println("La variable persona no apunta a ningun objeto");
        }

    }
}
class Persona{
    String nombre;
    Persona(String nombre){
        this.nombre=nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }
}
