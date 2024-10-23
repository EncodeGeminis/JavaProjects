package com.geminis.store.computadoras;

public class Teclado extends DispositivosEntrada {
    //atributos de la clase
    private int idEntrada;
    private static int contadorTeclados;
    //constructores
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idEntrada=++contadorTeclados;
    }
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+"Teclado [idEntrada=" + idEntrada + "]";
    }
    
}
