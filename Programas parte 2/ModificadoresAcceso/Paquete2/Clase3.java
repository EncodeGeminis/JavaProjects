package Paquete2;

import Paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
    //es una clase hija de la clase1, pero se encuentra en otro paquete 
    //se puede llamara al constructor protegido con la palabra super
    super("null","null");
    //acceder al constructor public de la clase1
    new Clase1();
    /*
    al llamar al constructor protegido da error
    new Clase1("uno", "dos");

    al llamar al constructor default da error
    new Clase1("null", "null", "null");

    llamar al constructor private da error sin importar estar 
    en el mismo paquete
    new Clase1("null", "null", "null", "null");
     */ 
    } 
    public void pruebaDesdeClase3(){
        //acceder a los atributos de la clase 1
        Clase1 c1= new Clase1();
        //acceder al atributo publico
        System.out.println("atributo publico: "+c1.atributoPublico);
        //se puede acceder al atributo protected sin asignarlo a un objeto de la Clase1
        System.out.println("atributo protegido: "+atributoProtected);
        //no se puede acceder ya que estamos en otro paquete
        //System.out.println("atributo default: "+c1.atributoDefault);
        /*
        no se puede acceder al atributo privado desde otra clase
        System.out.println("atributo private: "+c1.atributoPrivate);
         */
        //acceder a los metodos de la clase1
        System.out.println("Metodo publico: "+c1.metodoPublico());
        //se puede llamar sin la referencia al objeto de clase1
        System.out.println("Metodo protegido: "+metodoProtected());
        //no se puede acceder al estar en otro paquete
        //System.out.println("Metodo default: "+c1.metodoDefault());
        /*
        no se puede acceder a metodos privados desde la clase1
        System.out.println("Metodo private: "+c1.metodoPrivate());
         */
    }
    public static void main(String[] args) {
        Clase3 c3= new Clase3();
        c3.pruebaDesdeClase3();
    }
}
