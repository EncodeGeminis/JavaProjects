package com.geminis.ordenes;

import com.geminis.store.computadoras.Computadora;

public class OrdenComputadoras {
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;
    //definicion de constructores
    public OrdenComputadoras(){
        this.idOrden=++contadorOrdenes;
        computadoras= new Computadora[MAX_COMPUTADORAS];
    }
    //definicion de Metodos
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++]=computadora;
        }else{
            System.out.println("no se pueden agregar mas elementos");
        }
    }
    public double calcularTotal(){ 
        double total=0;
        //iteracion de la orden
        for(int i=0;i<this.contadorComputadoras;i++){
            Computadora totalOrden=this.computadoras[i];
            total+=totalOrden.getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden numero:"+idOrden);
        System.out.println("Total de la compra: "+this.calcularTotal());
        System.out.println(":Productos en la orden:\n");
        //imprimiendo las computadoras
        for(int i=0;i<this.contadorComputadoras;i++){
            Computadora computadora=computadoras[i];
            System.out.println(computadora+"\n");
        }

    }   
}

