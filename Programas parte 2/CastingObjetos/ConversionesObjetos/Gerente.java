package ConversionesObjetos;

public class Gerente extends Empleados{
    private String departamento;
    //constructor con dos argumentos
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento=departamento;
    }
    //sobreescribir metodo obtenerDEtalles
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+" , departamento: "+departamento;
    }
    //metodos get y set
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
