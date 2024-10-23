package com.geminis.store.telefonos;

public class Telefono {
    //definicion de atributos
    private int idTelefono;
    private static int contadorTelefonos=1000;
    private String marca;
    private int precio;
    private int capacidad;
    //definicion de constructores
    private Telefono(){
        this.idTelefono=++contadorTelefonos;
    }
    public Telefono(String marca, int precio, int capacidad){
        this();
        this.marca=marca;
        this.precio=precio;
        this.capacidad=capacidad;
    }
    //definicion de metodos get y set 
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public String toString() {
        return "Telefonos [idTelefono=" + idTelefono + ", marca=" + marca + ", precio=" + precio + ", capacidad="
                + capacidad + "gb]";
    }
}
