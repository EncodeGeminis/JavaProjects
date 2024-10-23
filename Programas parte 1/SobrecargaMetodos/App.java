public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sobrecarga de Metodos");
        //se llama el metodo con enteros
        System.out.println("Resultado: "+ Operaciones.sumar(4, 4));
        //se llama el metodo con double
        System.out.println("Resultado2: "+Operaciones.sumar(3.5, 3.8));
    }
}
