
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enumeraciones");
        System.out.println("Dia uno: "+Dias.LUNES);
        
        //prueba de funcionalidad
        indicarDia(Dias.LUNES);
        indicarDia(Dias.MARTES);
        //utilizar enumeracion de paises
        System.out.println("continente: "+Continentes.AMERICA);
        System.out.println("numero de paises:"+Continentes.AMERICA.getPaises());
        System.out.println("Continente: "+Continentes.AFRICA);
        System.out.println("numero paises: "+Continentes.AFRICA.getPaises());
        //imprimir todos los continentes
        imprimirContinentes();

    }
    public static void indicarDia(Dias dia){
        switch (dia) {
            case LUNES:
            System.out.println("Es el primer dia");
                break;
            case MARTES:
                System.out.println("es el segundo dia");
                break;
            default:
            System.out.println("no existe");
                break;
        }
    }
    public static void imprimirContinentes(){
        //usando ciclo foreach
        for(Continentes c: Continentes.values()){
            System.out.println("Continente: "+c+" contiene: "+c.getPaises()+" paises");
        }
    }
}

