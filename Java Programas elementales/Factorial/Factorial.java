import javax.swing.JOptionPane;
public class Factorial {

    public static void main(String[] args) {
        int numero;
        long factorial=1;
        System.out.println("Factorial");
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        for(int i=1;i<=numero;i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial de: "+numero+" es: "+factorial);
    }
}
