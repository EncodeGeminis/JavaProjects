public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("For Each");
        int[] edades={1,2,3,4,5,6,7,5,4};
        //iteracion con for each
        for(int edad: edades){
            System.out.println("edad: "+edad);
        }
        //arreglo de Tipo Persona
        Persona[] personas={new Persona("geminis"), new Persona("Acuario")};
        //for each
        for(Persona p : personas){
            System.out.println("Persona: "+p);
        }
    }
}
