package Paquete1;

public class Clase1 {
    //definir atributos
    public String atributoPublico="Valor atributo publico";
    protected String atributoProtected="Valor atributo protegido";
    String atributoDefault="valor atributo default";
    private String atributoPrivate="Valor atributo privado";
    //constructor
    public Clase1(){
        System.out.println("Constructor publico vacio");
    }
    public Clase1(String texto){
        System.out.println("constructor publico con un argumento = "+texto);
    }
    protected Clase1(String texto, String texto2){
        System.out.println("Constructor protected con dos argumentos: "
        +texto+" , "+texto2);
    }
    Clase1(String texto,String texto2,String testo3){
        System.out.println("Constructor default");
    }
    private Clase1(String txt, String txt2,String txt3,String txt4){
        System.out.println(":Constructor privado:");
    }
    //metodos
    public String metodoPublico(){
        return "Metodo publico";
    }
    protected String metodoProtected(){
        return "Metodo protected";
    }
    String metodoDefault(){
        return"Metodo default";
    }
    private String metodoPrivate(){
        return "Metodo privado";
    }
}
