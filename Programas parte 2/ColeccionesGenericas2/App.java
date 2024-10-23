import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Colecciones genericas 2");
        //iniciar una lista solo de elementos de tipo String
        List<String> lista= new ArrayList();
        lista.add("Geminis");
        lista.add("Acuario");
        lista.add("otro nombre:");
        lista.add("Geminis");
        //metodo para imprimir la lista 
        imprimir(lista);
        //coleccion de tipo Set
        Set<String> miSet= new HashSet();
        miSet.add("April");
        miSet.add("June");
        //imprimir el Set
        imprimir(miSet);
        //Coleccion de tipo Map llave y valor asociado<tipo, tipo> 
        Map<String,String> mapa= new HashMap();
        //agregnado elementos al mapa
        mapa.put("valor1","Geminis");
        mapa.put("valor2","Acuario");
        //obteniendo los valores del mapa
        imprimir(mapa.keySet());
        imprimir(mapa.values());
        //imprimir el elemento asociado a una llave
        System.out.println(mapa.get("valor1"));

    }
    private static void imprimir(Collection<String> coleccion){
        //iteracion de la lista 
        //al tener un tipo definido ya no es necesario utilizar el Objeto
        for(String elemento : coleccion ){
            System.out.println("elemento: "+elemento);
        }
        System.out.println("");
    }

}
