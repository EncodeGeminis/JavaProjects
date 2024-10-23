import java.lang.Math;
import javax.swing.JOptionPane;
public class NumeroAleatorio {

    public static void main(String[] args) {
        int numero, contador=0;
        int aleatorio;
        System.out.println("Juego con numero aleatorio");
        aleatorio=(int)(Math.random()*100);
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
            if(aleatorio>numero){
                System.out.println("Escribe un numero mayor:");
            }
            else{
                System.out.println("Escribe un numero menor");
            }
            contador++;
        }while(numero != aleatorio);
        System.out.println("Felicidades adivinaste el numero "+numero+" en "+contador+" intentos");
    }
}
