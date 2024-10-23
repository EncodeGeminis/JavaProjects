package abstracta.domain;
//hereda de la clase abstracta
public class Triangulo extends FiguraGeometrica{
    //constructor 
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    //metodo de la clase abstracta
    public void dibujar(){
        System.out.println("Dibujando: "+this.getClass().getSimpleName());
    }
}
