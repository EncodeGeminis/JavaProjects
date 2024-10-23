import java.util.Date;
public class Cliente extends Persona{
    //definicionde atributos 
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes; 
    //constructores
    public Cliente(Date fechaRegistro,boolean vip){
        super();
        this.idCliente= ++contadorClientes;
        this.fechaRegistro=fechaRegistro;
        this.vip=vip;
    }
    //metodos Get y Set
    public int getIdCliente() {
        return idCliente;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public static int getContadorClientes() {
        return contadorClientes;
    }
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+ "\nCliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
    }    
}
