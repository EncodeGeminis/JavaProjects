package SobreEscritura;

public class prueba {
    public static void main(String[] args) {
        //prueba de sobre escritura
        Empleado empleado= new Empleado("Geminis",1590);
        System.out.println("Empleado: "+empleado.obtenerDetalles());
        Gerente gerente= new Gerente("Diana",5000, "Software");
        System.out.println("Gerente: "+gerente.obtenerDetalles());
    }
}
