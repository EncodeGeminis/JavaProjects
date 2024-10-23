package Dominio;

public class ClaseObject {
    public static void main(String[] args) {
        //pruebas
        //los dos objetos tienen los mismos valores
        //pero son objetos diferentes
        Empleado e1=new Empleado("Geminis", 10000);
        Empleado e2= new Empleado("Geminis", 10000);
        System.out.println("Referencia: "+(e1==e2));
        //metodo para comparar objetos
        compararObjetos(e1, e2);
    }
    private static void compararObjetos(Empleado e1, Empleado e2){
        System.out.println("Empleado1: "+e1);
        System.out.println("Empleado2: "+e2);
        //revision por referencia
        if(e1==e2){
            System.out.println("Los objetos tienen la misma direccion en memoria");
        }else{
            System.out.println("Tienen distinta direccion en memoria");
        }
        //revision metodo equals para ver
        //si tienen el mismo contenido
        if(e1.equals(e2)){
            System.out.println("Tienen el mismo contenido");
        }else{
            System.out.println("No tienen el mismo contenido");
        }
        //revision metodo hashcode
        if(e1.hashCode()==e2.hashCode()){
            System.out.println("Los objetos tienen el mismo hashcode");
        }else{
            System.out.println("No tienen el mismo hashcode");
        }

    }

}
