package Paquete1;

public class Clase2 {
    public Clase2(){
        //ambos estan dentro del mismo paquete
        //acceder al constructor public de la clase1
        new Clase1();
        //se manda a llamar el constructor protegido
        new Clase1("uno", "dos");
        //se manda a llamar al constructor default
        new Clase1("null", "null", "null");
        /*
        llamar al constructor private da error sin importar estar 
        en el mismo paquete
        new Clase1("null", "null", "null", "null");
         */   
    }
    public void pruebaDesdeClase2(){
        //acceder a los atributos de la clase 1
        Clase1 c1= new Clase1();
        //acceder al atributo publico
        System.out.println("atributo publico: "+c1.atributoPublico);
        System.out.println("atributo protegido: "+c1.atributoProtected);
        System.out.println("atributo default: "+c1.atributoDefault);
        /*
        no se puede acceder al atributo privado desde otra clase
        System.out.println("atributo private: "+c1.atributoPrivate);
         */
        //acceder a los metodos de la clase1
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protegido: "+c1.metodoProtected());
        System.out.println("Metodo default: "+c1.metodoDefault());
        /*
        no se puede acceder a metodos privados desde la clase1
        System.out.println("Metodo private: "+c1.metodoPrivate());
         */
    }
    public static void main(String[] args) {
        Clase2 c2= new Clase2();
        c2.pruebaDesdeClase2();
    }
}
