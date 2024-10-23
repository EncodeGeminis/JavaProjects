import java.util.Scanner;
import javax.swing.JOptionPane;

public class MatrizMultiple {

    public static void main(String[] args) {
        System.out.println("Matriz");
        Scanner leer=new Scanner(System.in);
        int matriz[][],nFilas,nColumnas;
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: "));
        nColumnas=Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: "));
        matriz=new int[nFilas][nColumnas]; //de instancia la matriz
        //se definen los valores de la matriz
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=leer.nextInt();
            }
        }
        //Se imprime la matriz
        for(int i=0;i<nFilas;i++){ //numero de filas
            for(int j=0;j<nColumnas;j++){ //numero de columnas
                System.out.print(matriz[i][j]+" - ");
            }
            System.out.println("");//salto de linea
        }
    }
}

