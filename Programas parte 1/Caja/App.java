public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Construccion de una caja");
        //declaracion de variables
        int alto=10;
        int ancho=5;
        int profundo=2;
        //crear un objeto de la Caja 
        Caja caja= new Caja(alto, ancho, profundo);
        System.out.println("Medidas de la caja");
        System.out.println("Alto: "+alto);
        System.out.println("Ancho: "+ancho);
        System.out.println("profundo: "+profundo);
        System.out.println("volumen: "+caja.calcularVolumen());


    }
}
