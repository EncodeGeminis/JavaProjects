package Dominio;

public class Empleado {
    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }    
    //sobreescribir metodo toString
    @Override
    public String toString() {
        return super.toString()+ "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }
    //metodos equals y hashcode
    @Override
    public int hashCode() {
        //se define un valor hashcode para evitar la duplicidad
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //se compara la referencia
        if (this == obj)
            return true;
        // si los objetos son distintos
        if (obj == null)
            return false;
        //se compara si las clases son distintas entre cada objeto
        if (getClass() != obj.getClass())
            return false;
        //se hace una conversion del objeto para compararlos   
        Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        //se compara si los valores son diferentes, si un atributo es distinto
        //los objetos son distintos
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false;
        return true;
    } 
}
