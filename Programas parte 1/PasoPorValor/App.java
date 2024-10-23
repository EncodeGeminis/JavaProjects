public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Paso Por Valor");
        var x = 10;
        System.out.println("valor: "+x);
        cambiarValor(x);
        System.out.println("nuevo valor x: "+x);

    }
    private static void cambiarValor(int arg) {
        arg = 20;
        System.out.println("valor arg: "+arg);
    }
}
