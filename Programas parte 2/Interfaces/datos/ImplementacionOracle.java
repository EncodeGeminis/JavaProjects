package datos;
//una clase puede implementar de diferentes interfaces
public class ImplementacionOracle implements AccesoDatos{
    //implementacion de los metodos de la interface
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }
    public void listar() {
        System.out.println("Listado desde Oracle");
    }
}
