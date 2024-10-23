public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Encapsulamiento");
        //se crea el objeto persona y se le asignan valores
        Persona persona1= new Persona("Geminis",1500.00, false);
        System.out.println("nombre: "+persona1.getNombre());
        System.out.println("Sueldo: "+persona1.getSueldo());
        System.out.println("Persona borrada: "+persona1.isEliminado());
        //se setean los valores utilizando los metodos set
        persona1.setNombre("Sagitario");
        persona1.setSueldo(3500.00);
        persona1.setEliminado(true);
        //imprimiendo los valores modificados con los metodos get
        System.out.println("nombre modificado: "+persona1.getNombre());
        System.out.println("Sueldo: "+persona1.getSueldo());
        System.out.println("Persona borrada: "+persona1.isEliminado());
        //implementacion metodo toString
        System.out.println("llamada directa: "+persona1);
    }
}
