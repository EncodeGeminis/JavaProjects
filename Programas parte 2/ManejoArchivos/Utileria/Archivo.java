package Utileria;

import java.io.*;

//realizara las operaciones sobre el archivo
public class Archivo {
    //metodo para crear un archivo
    public static void crearArchivo(String nombreArchivo){
        File archivo= new File(nombreArchivo);
        //crear el nuevo objeto de tipo printWriter
        try {
            PrintWriter salida= new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo){
        //se crea el objeto para asignar el archivo a un objeto
        File archivo = new File(nombreArchivo);
        //creamos el objeto de tipo prinWritter
        try {
            PrintWriter salida= new PrintWriter(archivo);
            //agregamos contenido al archivo 
            String contenido= "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            //se escribe en consola si se ha escrito correctamente en el archivo
            System.out.println("Se ha escrito correctamente el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void leerArchivo(String nombreArchivo){
        File archivo= new File(nombreArchivo);
        //se usara buffered reader para leer informacion del archivo
        try {
            BufferedReader entrada= new BufferedReader(new FileReader(archivo));
            //se leen las lineas del archivo
            String lectura= entrada.readLine();
            //se lee toda la informacion del archivo en la consola
            while(lectura != null){
                System.out.println(lectura);
                lectura= entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    } 
    public static void agresarArchivo(String nombreArchivo){
        File archivo= new File(nombreArchivo);
         try {
            PrintWriter salida= new PrintWriter(new FileWriter(archivo, true));
            //informacion a agregar
            String contenido="Agregando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de agregar informacion");
            salida.close();
            System.out.println("Se agrego la informacion al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
}
