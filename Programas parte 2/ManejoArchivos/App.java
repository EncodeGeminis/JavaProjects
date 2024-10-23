import static Utileria.Archivo.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Manejo archivos");
        //definir una variable String y asignar la ruta para guardar el archivo
        String nombreArchivo= "C:\\Users\\BlakeRx\\Desktop\\example II\\archivoPrueba.txt";
        /*
        //creamos un archivo
        crearArchivo(nombreArchivo);
        //escribimos en el archivo
        escribirArchivo(nombreArchivo);
         */
        //leer archivo
        //leerArchivo(nombreArchivo);
        //agregar informacion a un archivo
        agresarArchivo(nombreArchivo);
        //metodo leer archivo
        leerArchivo(nombreArchivo);
    }
}
