package com.geminis.ventas;

public class Orden {
    private int idOrden;
    // se hace la relacion con la clase Productos
    private Producto productos[];// se declara la variable del arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    // constructores
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];// se inicializa el arreglo
    }

    // Metodos
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el limite de productos " + MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        //se hace una iteracion de los totales 
        double total=0;
        for(int i=0;i <this.contadorProductos;i++){
            Producto producto= this.productos[i];
            //se agrega cada uno de los precios de cadas producto en el arreglo
            total += producto.getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden con el numero: "+this.idOrden);
        System.out.println("total: "+this.calcularTotal());
        System.out.println("Productos de la orden: ");
        //imprimiendo los productos del arreglo
        for(int i=0;i<this.contadorProductos;i++){
            Producto producto = productos[i];
            System.out.println(producto);
        }
    }
}
