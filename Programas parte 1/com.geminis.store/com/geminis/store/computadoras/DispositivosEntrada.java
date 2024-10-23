package com.geminis.store.computadoras;

public class DispositivosEntrada {
    //definicion de atributos
    private String tipoEntrada;
    private String marca;
    //definicion de constructores
    public DispositivosEntrada(String tipoEntrada, String marca){
        this.tipoEntrada=tipoEntrada;
        this.marca=marca;
    }
    //definicion de metodos
    public String getTipoEntrada() {
        return tipoEntrada;
    }
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //definicion de metodo toString
    @Override
    public String toString() {
        return "DispositivosEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
    }
}
