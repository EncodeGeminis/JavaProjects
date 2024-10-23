import javax.swing.JOptionPane;
public class BusquedaBinaria {

    public static void main(String[] args) {
        System.out.println("Busqueda Binaria");
        int arreglo[]={1,2,3,4,5};//tiene que estar ordenado de manera ascendente
        int dato,inf,sup,mitad;
        boolean bandera=false;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Introduce un dato a buscar: "));
        //busqueda binaria
        inf=0;  //se inciliaza en 0
        sup=5;  //se inicializa con la cantidad de datos que tiene el arreglo
        int i=0;
        mitad=(sup+inf)/2;
        while(inf<=sup && i<5){
            if(arreglo[mitad]==dato){
                bandera=true; 
                break;
            }
            if(arreglo[mitad]>dato){
                sup=mitad;
                mitad=(sup+inf)/2;
            }
            if(arreglo[mitad]<dato){
                inf=mitad;
                mitad=(sup+inf)/2;
            }
            i++;
        }
        //imprimiendo resultados
        if (bandera==true){
            System.out.println("el nmero ha sido encontrado en la posicion: "+mitad);     
        }
        else{
            System.out.println("el valor no ha sido encontrado");
        }
    }
}
