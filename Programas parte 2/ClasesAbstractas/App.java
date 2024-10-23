import abstracta.domain.FiguraGeometrica;
import abstracta.domain.Rectangulo;
import abstracta.domain.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Clases abstractas");
        //no se pueden crear objetos de la clase abstracta
        //FiguraGeometrica figura=new FiguraGeometrica();
        FiguraGeometrica rectangulo=new Rectangulo("rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        //no se puede acceder al metodo de la clase abstract con super
        //super.dibujar();
        FiguraGeometrica triangulo=new Triangulo("triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        
    }
}
