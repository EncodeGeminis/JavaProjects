//la clase hereda de la super clase Persona
public class Empleado extends Persona{
 //atributos del empleado
 private int idEmpleado;
 private double sueldo;
 private static int contadorEmpleados;//pertenece a la clase
 //constructores
 public Empleado(String nombre, double sueldo){
    //accede al constructor con solo un argumento
    super(nombre);
    //se aumenta la variable static del contador
    this.idEmpleado= ++contadorEmpleados;
    this.sueldo=sueldo;
 }
 //metodos Get y Set
public int getIdEmpleado() {
    return idEmpleado;
}
public double getSueldo() {
    return sueldo;
}
public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
}
public static int getContadorEmpleados() {
    return contadorEmpleados;
}
//metodo toString
@Override
public String toString() {
    return super.toString()+ "\nEmpleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
}
}
