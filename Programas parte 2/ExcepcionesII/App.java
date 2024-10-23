import datos.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interface");
        //pruebas
        AccesoDatos datos= new ImplementacionOracle();
        datos.insertar();
        datos.listar();

        datos= new ImplementacionMysql();
        datos.listar();
        System.out.println("Valor Registros: "+AccesoDatos.MAX_REGISTROS);
    }
}
