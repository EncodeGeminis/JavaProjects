package com.geminis.ventas;

public class Producto {
    //definicion atributos del objeto
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    //constructores
    private Producto(){
        this.idProducto=++contadorProductos;
    }
    public Producto(String nombre, double precio){
        this();
        this.nombre=nombre;
        this.precio=precio;
    }
    //metodos get y set
    //se elimina el metodos set idProducto
    //se elimina el metodo setcontadorProductos
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static int getContadorProductos() {
        return contadorProductos;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
