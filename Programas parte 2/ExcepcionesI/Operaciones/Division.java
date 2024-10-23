package Operaciones;

public class Division {
    //clase normal del codigo
    private int numerador;
    private int denominador;
    //en el constructor indicamos que podria arrojar una excepcion
    public Division(int numerador, int denominador) throws OperacionExcepcion{
        //se hace la validacion si es una operacion no valida
        //y arrojar la excepcion
        if(denominador==0){
            //se crea un objeto de tipo exception de la clase personalizada
            throw new OperacionExcepcion("Denominador igual a 0");
        }
        this.numerador=numerador;
        this.denominador=denominador;
    }
    //metodos del objeto 
    public void imprimirOperacion(){
        System.out.println("el resultado es: "+(numerador/denominador));
    }
}
