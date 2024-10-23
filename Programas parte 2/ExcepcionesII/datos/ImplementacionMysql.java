package datos;

import Excepciones.*;

public class ImplementacionMysql implements AccesoDatos{
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx{
        //se hara la validacion para ver el error
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
        System.out.println("Listar desde MySql");
        }
    }
    @Override
    public void simularError(boolean simularError) {
        this.simularError=simularError;
    }
    //metodos get/set/is
    public boolean isSimularError() {
        return simularError;
    }
}
