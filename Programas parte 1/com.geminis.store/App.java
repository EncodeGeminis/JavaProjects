import com.geminis.ordenes.OrdenComputadoras;
import com.geminis.ordenes.OrdenTelefono;
import com.geminis.store.computadoras.Computadora;
import com.geminis.store.computadoras.Monitor;
import com.geminis.store.computadoras.Raton;
import com.geminis.store.computadoras.Teclado;
import com.geminis.store.telefonos.Telefono;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Venta de Computadoras");
        Raton raton=new Raton("raton", "Sony");
        Teclado teclado= new Teclado("Teclado", "Logitech");
        Monitor monitor= new Monitor("Samsung", "32 pulgadas");
        Computadora computadora= new Computadora("Asus",10000, monitor, teclado, raton);
        
        Raton raton2=new Raton("raton", "Logitech");
        Teclado teclado2= new Teclado("Teclado", "Logitech");
        Monitor monitor2= new Monitor("Xiaomi", "26 pulgadas");
        Computadora computadora2= new Computadora("Samsung",12000, monitor2, teclado2, raton2);
        

        OrdenComputadoras orden1=new OrdenComputadoras();
        orden1.agregarComputadora(computadora);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        System.out.println("_______________________");
        OrdenComputadoras orden2= new OrdenComputadoras();
        orden2.agregarComputadora(computadora2);
        orden2.agregarComputadora(computadora2);

        orden2.mostrarOrden();
        Telefono telefono=new Telefono("Xiaomi", 4500, 128);
        Telefono telefono2=new Telefono("Samsung", 10500, 512);
        OrdenTelefono orden3=new OrdenTelefono();
        orden3.agregarTelefono(telefono);
        orden3.agregarTelefono(telefono2);
        orden3.mostrarOrden();
    }
}
