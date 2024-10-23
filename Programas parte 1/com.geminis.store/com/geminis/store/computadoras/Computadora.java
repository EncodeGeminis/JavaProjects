package com.geminis.store.computadoras;

public class Computadora {
    //definicionde atributos 
    private int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private int precio;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    //definicion de constructores
    private Computadora(){
        this.idComputadora=++contadorComputadoras;
    }
    public Computadora(String nombre,int precio, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.precio=precio;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }
    //metodos get y set
    public int getIdComputadora() {
        return idComputadora;
    }
    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public Raton getRaton() {
        return raton;
    }
    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", precio=" + precio
                + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + "]";
    }
    
}
