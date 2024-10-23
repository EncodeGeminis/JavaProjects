package InstanceOf;

public class prueba {
    public static void main(String[] args) {
        System.out.println("instance Of");
        Empleado empleado= new Empleado("Geminis",1590);
        determinarTipo(empleado);
        Gerente gerente= new Gerente("Diana",5000, "Software");
        determinarTipo(gerente);
    }
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Nombre gerente: "+empleado.getNombre());
            Gerente gerente=(Gerente) empleado;
            System.out.println("Departamento: "+gerente.getDepartamento());
        }else if(empleado instanceof Empleado){
            System.out.println("Nombre Empleado: "+empleado.getNombre());
        }
    }
}
