import javax.swing.JOptionPane;
public class BusquedaSecuencial {

    public static void main(String[] args) {
        System.out.println("Busqueda secuencial en un arreglo");
        int arreglo[]={4,1,5,2,3};
        int dato;
        boolean bandera=false;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dato a buscar: "));
        //busqueda secuencial dentro del arreglo
        int i=0;
        while(i<5 && bandera==false){
            if(arreglo[i]==dato){
                bandera=true;
            }
            i++;
        }
        if(bandera==false){
            System.out.println("El valor no ha sido encontrado...");
        }
        else{
            System.out.println("su dato se ha encontrado en la posicion: "+(i-1));
            
        }
    }
}

