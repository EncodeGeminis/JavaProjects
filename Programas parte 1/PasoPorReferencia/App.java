public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Paso por referencia");
        //definir un objeto de tipo persona 
        Persona persona = new Persona();
        persona.cambiarNombre("Geminis");
        System.out.println("Nombre: "+persona.obtenerNombre());
        //concepto de paso por referencia 
        modificarPersona(persona);
        System.out.println("Nombre Modificado: "+persona.obtenerNombre());
    }

    private static void modificarPersona(Persona argPersona) {
        argPersona.cambiarNombre("Sagitario");
    }
}
