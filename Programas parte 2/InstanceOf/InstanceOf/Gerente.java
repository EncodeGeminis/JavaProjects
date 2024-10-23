package InstanceOf;

public class Gerente extends Empleado{
    private String departamento;
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento=departamento;
    }
    //sobre escritura del metodo padre heredado
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() 
        +", departamento: "+departamento;
    }
    //metodos get y set para departamento
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 
}
