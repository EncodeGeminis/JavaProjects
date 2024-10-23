package com.geminis.store.computadoras;

public class Monitor {
    //definicion de atributos
    private int idMonitor;
    private String marca;
    private String size;
    private static int contadorMonitores;
    //creacion de constructores
    private Monitor(){
        this.idMonitor=++contadorMonitores;
    }
    public Monitor(String marca,String size){
        this();
        this.idMonitor=contadorMonitores;
        this.marca=marca;
        this.size=size;
    }
    //metodos get y set
    public int getIdMonitor() {
        return idMonitor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public static int getContadorMonitores() {
        return contadorMonitores;
    }
    //metodos toString
    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", size=" + size + "]";
    }
}
