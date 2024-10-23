public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uso de This");
        Persona persona = new Persona("Geminis");
    }
}
//clases
class Persona{
    String nombre;
    //constructor vacio
    public Persona(){}
    //constructor con paso de parametros
    public Persona(String nombre){
        //this apunta a un objeto de tipo persona
        System.out.println("operador this en la clase persona: "+this);
        this.nombre=nombre;//this apunta a un objeto de tipo persona
        Imprimir imprimir =new Imprimir();
        //se puede pasar el objeto persona con (this)
        //this contiene una referencia al objeto persona
        imprimir.imprimir(this);
    }
}
class Imprimir{
    //metodos
    public void imprimir(Persona p){
        System.out.println("Impresion persona: "+p);//se imprime el objeto persona
        System.out.println("operador (this): "+this);
    } 
}
