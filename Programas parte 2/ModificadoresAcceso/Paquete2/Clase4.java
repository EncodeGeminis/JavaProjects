package Paquete2;

import Paquete1.Clase1;

public class Clase4 {
    public Clase4(){
    //acceder al constructor public de la clase1
    new Clase1();
    /*
    al llamar al constructor protegido da error
    new Clase1("uno", "dos");
    al llamar al constructor default da error
    new Clase1("null", "null", "null");
    llamar al constructor private da error
    new Clase1("null", "null", "null", "null");
     */ 
    }
    public void pruebaDesdeClase4(){
        //acceder a los atributos de la clase 1
        Clase1 c1= new Clase1();
        //acceder al atributo publico
        System.out.println("atributo publico: "+c1.atributoPublico);
        //no se puede acceder al atributo protected
        //System.out.println("atributo protegido: "+c1.atributoProtected);
        //no se puede acceder ya que estamos en otro paquete
        //System.out.println("atributo default: "+c1.atributoDefault);
        /*
        no se puede acceder al atributo privado desde otra clase
        System.out.println("atributo private: "+c1.atributoPrivate);
         */
        //acceder a los metodos de la clase1
        System.out.println("Metodo publico: "+c1.metodoPublico());
        //no se puede llamaral objeto protected
        //System.out.println("Metodo protegido: "+metodoProtected());
        //no se puede acceder al estar en otro paquete
        //System.out.println("Metodo default: "+c1.metodoDefault());
        /*
        no se puede acceder a metodos privados desde la clase1
        System.out.println("Metodo private: "+c1.metodoPrivate());
         */
    }
    public static void main(String[] args) {
        Clase4 c4= new Clase4();
        c4.pruebaDesdeClase4();
    }
}
