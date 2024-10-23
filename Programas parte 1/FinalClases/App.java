import com.geminis.ventas.Orden;
import com.geminis.ventas.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("diseño de clases");
        //creamos objetos de tipo producto
        Producto producto1= new Producto("Camisa",100.00);
        Producto producto2=new Producto("pantalon", 150.00);
        //creamos un objeto de tipo orden
        Orden orden1=new Orden();
        //agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //imprimimos la orden
        orden1.mostrarOrden();
        Orden orden2=new Orden();
        //agregamos los productos a la orden
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        //imprimimos la orden
        orden2.mostrarOrden();
        
    }
}
