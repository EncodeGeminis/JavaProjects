package abstracta.domain;
//hereda de la clase figura geometrica
public class Circulo extends FiguraGeometrica {

    //constructor
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    //comportamiento abstracto implementado
    public void dibujar(){
        //se agrega el coportamiento 
        System.out.println("se dibuja un: "+this.getClass().getSimpleName());
    }   
}
