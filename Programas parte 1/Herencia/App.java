import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("herencia");
        //objeto de tipo empledo
        Empleado empleado1= new Empleado("Geminis", 8000);
        empleado1.setEdad(26);
        empleado1.setGenero('H');
        empleado1.setDireccion("Ciudad de Mexico");
        System.out.println(empleado1);
        
        //objeto de tipo cliente
        Cliente cliente1= new Cliente(new Date(), true);
        cliente1.setNombre("Acuario");
        cliente1.setEdad(22);
        cliente1.setDireccion("Pachuca");
        cliente1.setGenero('M');
        //imprimiendo el objeto cliente

        System.out.println(cliente1);

    }
}
