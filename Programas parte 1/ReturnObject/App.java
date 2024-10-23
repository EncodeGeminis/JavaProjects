public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Return Clases");
        //se crea un objeto de manera indirecta 
        Suma s=crearObjetoSuma();
        System.out.println("Resultado Suma: "+s.sumar());
    }
    //metodo que crea el objeto
    private static Suma crearObjetoSuma(){
        Suma suma = new Suma(2,3);
        return suma;
    }
}
//se define fuera de la clase principal
class Suma{
    int a;
    int b;
    //constructor vacio
    public Suma(){}
    //constructor con paso de argumentos
    public Suma(int arg, int arg2){
       this.a=arg;
       this.b=arg2;
    }
    //metodo para sumar los atributos de la clase
    public int sumar(){
        return this.a+this.b;
    }
}