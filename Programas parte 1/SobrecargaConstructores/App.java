public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sobrecarga Constructores");
        //objeto de tipo persona
        Persona persona1= new Persona("Diana", 26);
        System.out.println(persona1);
        Empleado empleado1 = new Empleado("Acuario", 26, 5000);
        System.out.println(empleado1);
    }
}
