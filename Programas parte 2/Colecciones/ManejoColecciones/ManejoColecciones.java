package ManejoColecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        //definir variable de tipo Lista 
        List lista= new ArrayList();
        //llamando al metodo add
        lista.add("Nombre");
        lista.add(23);
        lista.add(true);
        //elemento repetido
        lista.add(43);
        //imprimir los resultados 
        imprimir(lista);
        //definir variables de  tipo Set
        Set miSet= new HashSet();
        miSet.add(12);
        miSet.add(300);
        //elemento repetido
        miSet.add(300);
        //imprimir los resultados
        imprimir(miSet);
        //definir variable de tipo Map
        Map miMap = new HashMap();
        //se utiliza llave/valor
        miMap.put("valor1", "Geminis");
        miMap.put("valor2","Sims");
        //repetir elemento
        miMap.put("valor2","Remplazado");
        //imprimir los resultados
        //se imprimen solo las llaves sin respetar el orden
        imprimir(miMap.keySet());
        //imprimir los valores
        imprimir(miMap.values());
        //imprimiendo el elemento asociado a una llave
        System.out.println(miMap.get("valor1"));
    }
    //metodo para imprimir obteniendo la interface
    //para poder imprmir los tipos: set, list y map
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("Elemento: "+elemento);
        }
        System.out.println("");
    }
}
