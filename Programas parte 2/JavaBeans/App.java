import beans.PersonaBean;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Beans");
        //se crea un objeto bean
        PersonaBean bean= new PersonaBean();
        bean.setNombre("Geminis");
        bean.setEdad(26);
        //creando bean con el constructor de dos argumentos
        PersonaBean bean2= new PersonaBean("Acuario", 25);
        //imprimir los datos
        System.out.println(bean.getNombre());
        System.out.println(bean.getEdad());
        System.out.println(bean2);
    }
}
