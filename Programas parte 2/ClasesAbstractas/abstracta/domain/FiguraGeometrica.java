package abstracta.domain;
//definicion de una clase abstracta
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    //constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    //metodos abstractos
    public abstract void dibujar();
    //metodos get y set
    public String getTipoFigura() {
        return tipoFigura;
    }
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    //metodo toString
    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
    }
}
