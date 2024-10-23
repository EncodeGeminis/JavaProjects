package com.geminis.ordenes;

import com.geminis.store.telefonos.Telefono;

public class OrdenTelefono {
    //definicion de los atributos
    private int idOrden;
    private static int contadorOrden;
    private Telefono[] telefonos;
    private int contadorTelefonos;
    private static final int MAX_TELEFONOS=5;
    //definicion de los constructores
    public OrdenTelefono(){
        this.idOrden=++contadorOrden;
        telefonos= new Telefono[MAX_TELEFONOS];
    }
    //definicion de los metodos
    public void agregarTelefono(Telefono telefono){
        if(contadorTelefonos<MAX_TELEFONOS){
            telefonos[this.contadorTelefonos++]=telefono;
        }else{
            System.out.println("no se puede agregar el elemento");
        }
    }
    public int calcularTotal(){
        int total=0;
        //metodo que regre el total de la compra
        for(int i=0;i<this.contadorTelefonos;i++){
            Telefono telefono=this.telefonos[i];
            total+=telefono.getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Id Orden: "+idOrden);
        System.out.println("Total compra: "+calcularTotal());
        System.out.println(":productos en la orden:");
        //iteracion de los productos en la orden
        for(int i=0;i<this.contadorTelefonos;i++){
            Telefono telefono=telefonos[i];
            System.out.println(telefono+"\n");
        }
    }


}
