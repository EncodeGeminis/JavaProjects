public class Empleado extends Persona {
    //atributos Empleado
    private double sueldo;

    //constructor necesario
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    //constructor sobrecargado
    public Empleado(String nombre, int edad, double sueldo){
        this(nombre, edad);
        this.sueldo=sueldo;
    } 
    //metodos get y set
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+ "\nEmpleado [sueldo=" + sueldo + "]";
    }   
}
