import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Herencia {
    public static void main(String[] args) throws Exception {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        //se crea un objeto de tipo persona
        Personas usuario1=new Personas("Uriel",27, "uriel@ejemplo.com");
        //imprimiendo los datos de usuario1
        System.out.println(usuario1.toString());
        //creamos un objeto del tipo Empleado
        Personas empleado1=new Empleados("Antonio",28,"Antonio@ejemplo.com",5000,"234322","Matutino");
        //imprimiendo el empleado1
        System.out.println(empleado1.toString());
    }
}
