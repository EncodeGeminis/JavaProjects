package Polimorfismo;

public class prueba {
    public static void main(String[] args) {
        //prueba de sobre escritura
        Empleado empleado= new Empleado("Geminis",1590);
        imprimirDetalles(empleado);
        Gerente gerente= new Gerente("Diana",5000, "Software");
        imprimirDetalles(gerente);
        //aplicando el polimorfismo
    }
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("Empleado = "+empleado.obtenerDetalles());
    }
}
