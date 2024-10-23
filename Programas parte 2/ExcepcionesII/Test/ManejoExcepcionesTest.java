package Test;

import Excepciones.AccesoDatosEx;
import Excepciones.LecturaDatosEx;
import datos.*;
public class ManejoExcepcionesTest {
    public static void main(String[] args) {
        System.out.println("Manejo de Excepciones");
        //definicion de objetos
        AccesoDatos datos= new ImplementacionMysql();
        datos.simularError(true);
        //metodo para simular la ejecucion de alguna operacion
        ejecutar(datos, "listar");
        ejecutar(datos, "insertar");
        AccesoDatos datos2= new ImplementacionOracle();
        datos2.simularError(true);
        //metodo para simular la ejecucion de alguna operacion
        ejecutar(datos2, "listar");
        ejecutar(datos2, "insertar");
    }
    private static void ejecutar(AccesoDatos dato, String accion){
        if("listar".equals(accion)){
            try {
                dato.listar();
            }catch (LecturaDatosEx e) {
                System.out.println("Error de lectura");
                e.getMessage();
            }
             catch (AccesoDatosEx e) {
                System.out.println("Error de acceso a datos");
                e.printStackTrace(System.out);
            }
            finally{
                System.out.println("Procesar finally es opcional");
            }
        }else if("insertar".equals(accion)){
            try {
                dato.insertar();
            } catch (AccesoDatosEx e) {
                System.out.println("Escepcion de acceso a datos");
            }
        }else{
            System.out.println("No se proporciono ninguna accion correcta");
        }
    }
}
