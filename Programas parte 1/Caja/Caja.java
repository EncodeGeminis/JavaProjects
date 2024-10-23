public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){}
    //constructor
    public Caja(int ancho, int alto, int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    //metodos 
    public int calcularVolumen(){
        int volumen= (this.alto*this.ancho*this.profundo);
        return volumen;
    }



}
