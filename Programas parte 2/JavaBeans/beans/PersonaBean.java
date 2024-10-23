package beans;

import java.io.Serializable;
//Siempre se agrega la implementacion de serializable
public class PersonaBean implements Serializable{
    //Definicion de un java bean
    //los atributos deben ser privados
    private String nombre;
    private int edad;
    //siempre debe tener un constructor vacio
    public PersonaBean(){}
    //pueden haber mas constructores
    public PersonaBean(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //siempre se deben tener metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //metodo toString
    @Override
    public String toString() {
        return "PersonaBean [nombre=" + nombre + ", edad=" + edad + "]";
    }
}
