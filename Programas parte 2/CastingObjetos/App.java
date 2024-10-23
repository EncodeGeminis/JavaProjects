import ConversionesObjetos.Empleados;
import ConversionesObjetos.Escritor;
import ConversionesObjetos.Gerente;
import ConversionesObjetos.TipoEscritura;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Casting objetos");
        Empleados empleado;
        //referencia de menor jerarquia Downcasting
        empleado =new Escritor("Geminis",5000, TipoEscritura.CLASICO);
        System.out.println(empleado.obtenerDetalles());
        //para acceder al metodo de escritor es necesario hacer el casting
        Escritor escritor=(Escritor) empleado;
        System.out.println(escritor.getTipoEscrituraTexto());;
        //segunda manera de hacer casting de manera directa 
        System.out.println(((Escritor)empleado).getTipoEscrituraTexto());
        //accede desde el metodo padre al metodo hijo
        empleado= new Gerente("Diana", 5000, "Sistemas");
        //casting para acceder a los metodos
        System.out.println(((Gerente)empleado).getDepartamento());
    }
}
