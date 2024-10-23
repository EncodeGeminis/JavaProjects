package abstracta.domain;
//hereda de la clase abstracta
public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    public void dibujar(){
        System.out.println("Dibujando: "+this.getClass().getSimpleName());
    }
}
