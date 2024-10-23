package com.geminis.store.computadoras;

public class Raton extends DispositivosEntrada {
    //definicion de atributos
    private int idRaton;
    private static int contadorRatones;
    //definicion de constructores
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton=++contadorRatones;
    }
    //definicion metodo toString
    @Override
    public String toString() {
        return super.toString()+"Raton [idRaton=" + idRaton + "]";
    }
    
}
