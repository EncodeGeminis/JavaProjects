package datos;

import Excepciones.AccesoDatosEx;
import Excepciones.EscrituraDatosEx;
import Excepciones.LecturaDatosEx;

//una clase puede implementar de diferentes interfaces
public class ImplementacionOracle implements AccesoDatos{
    //atributos
    private boolean simularError;
    //implementacion de los metodos de la interface
    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError){
            throw new EscrituraDatosEx("Error al escribir el dato");
        }else{
        System.out.println("Insertar desde Oracle");
        }
    }
    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error al leer los datos");
        }else{
        System.out.println("Listado desde Oracle");
        }
    }
    //metodo que simula el error
    @Override
    public void simularError(boolean simularError) {
        this.simularError=simularError;
    }
    //metodos get/set/is
    public boolean isSimularError() {
        return simularError;
    }
}
