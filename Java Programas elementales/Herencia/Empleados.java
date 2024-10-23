public class Empleados extends Personas{
    private int sueldo;
    private String codigo;
    private String turno;

    public Empleados(String nombre, int edad, String correo, int sueldo, String codigo,String turno){
        super(nombre,edad,correo);
        this.sueldo=sueldo;
        this.codigo=codigo;
        this.turno=turno;
    }
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    public int getSueldo(){
        return sueldo;
    }
    public String getCodigo(String codigo){
        return codigo;
    }
    public String getTurno(String turno){
        return turno;
    }
    public String toString(){
        return "\nNombre: "+super.getNombre()+"\nCorreo: "+super.getCorreo()+"\nSueldo: "+sueldo+"\nTurno: "+turno+"\nCodigo: "+codigo;
    }

}
