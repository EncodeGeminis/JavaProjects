public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Autoboxing y Unboxing");
        //Clases envolventes
        //Autoboxing (se envuelven tipos primitivos en wrappers)
        Float flotanteObj=10.15F;
        System.out.println("Valor Objeto: "+flotanteObj.intValue());
        //unboxing(se extrae el tipo primitivo del objeto wrapper)
        float flotante=flotanteObj;
        System.out.println("valor: "+flotante);
    }
}
