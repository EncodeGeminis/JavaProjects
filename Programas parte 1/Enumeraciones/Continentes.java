public enum Continentes {
    //definicion de constantes
    //tipo enumeracion y atributo paises
    AFRICA(53),
    AMERICA(34),
    EUROPA(46),
    ASIA(44),
    OCEANIA(14);
    //atributo paises
    private final int paises;
    //constructores
    Continentes(int paises){
        this.paises=paises;
    }
    public int getPaises(){
        return paises;
    }

}
