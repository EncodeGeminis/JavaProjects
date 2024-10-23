import com.geminis.ClaseFinal;
import com.geminis.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Palabra Final");
        //modificar un atributo de tipo object 
        ClaseFinal.VAR_PERSONA.setNombre("Geminis");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        ClaseFinal.VAR_PERSONA.setNombre("Acuario");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
    }
}
