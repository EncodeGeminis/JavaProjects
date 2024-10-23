public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Return tipos primitivos");
        int res = sumarRetornandoValor(2, 4);
        System.out.println("suma: "+res);

    }
    private static int sumarRetornandoValor(int arg, int arg2){
        if(arg==0 && arg2==0){
            System.out.println("EScribe valor diferente de 0");
            return 0;
        }
        return  arg + arg2;
    }
}
