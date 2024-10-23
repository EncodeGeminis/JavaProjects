public class CalculadoraCientifica extends Calculadora{
    private int numero;
    public void calcularSeno(int numero){
        double seno=Math.sin(Math.toRadians(numero));
        System.out.println("El seno es: "+seno);
    }
    public void calcularCoseno(int numero){
        double coseno=Math.cos(Math.toRadians(numero));
        System.out.println("El coseno es: "+coseno);
    }
    public void calcularTangente(int numero){
        double tan=Math.tan(Math.toRadians(numero));
        System.out.println("La tangente es: "+tan);
    }
}