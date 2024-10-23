public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Contexto Estatico");
        //creacion de objetos de la clase persona
        Persona persona1= new Persona("Geminis");
        Persona persona2= new Persona("Diana");
        Persona persona3= new Persona("Mercurio");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        //imprimiendo el contador estatico de la clase
        System.out.println("contador: "+Persona.getContadorPersonas());

    }
}
