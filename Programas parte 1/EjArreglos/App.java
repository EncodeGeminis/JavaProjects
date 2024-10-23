import Arreglos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Arreglos");
        //declarar la variable de tipo arreglo de enteros
        int[] edades;
        //instanciar el arreglo de tipo int
        edades= new int[3];
        //inicializar los valores del arreglo
        edades[0]=34;
        edades[1]=45;
        //imprmir los valores del arreglo
        System.out.println("elemento 1: "+edades[0]);
        System.out.println("elemento 2: "+edades[1]);
        System.out.println("elemento 3: "+edades[2]);

        //definir e instanciar un arreglo de tipo object
        Persona personas[]=new Persona[4];
        //inicializar los valores del arreglo
        personas[0]=new Persona("Geminis");
        personas[2]=new Persona("Acuario");
        //imprimiendo los objetos
        System.out.println("persona 1: "+personas[0].getNombre());
        System.out.println("persona 2: "+personas[1]);
        System.out.println("persona 3: "+personas[2].getNombre());
        System.out.println("persona 4: "+personas[3]);

        //notacion simplificada para arreglos 
        String nombres[]= {"Geminis","Acuario", "Libra", "Capricornio"};
        //recorrer el arreglo con for
        for(int i=0;i<nombres.length;i++){
            System.out.println("indice "+i+": "+nombres[i]);
        }
        nombres[i].length;

    }
}
