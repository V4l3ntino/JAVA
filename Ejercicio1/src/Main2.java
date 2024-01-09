import java.util.Arrays;
import java.util.Scanner;
import alumnos.Alumnos;

public class Main2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Alumnos[] lista = new Alumnos[3];

        // CREO OBJETOS ACCEDIENDO AL METODO SET
        for (int i = 0; i < lista.length; i++) {
            //inicializo el objeto al principio para no tener un NullPointerException en el futuro
            lista[i] = new Alumnos();
            //capturo los datos
            System.out.println("Ingresa el nombre");
            String nombre = leer.next();
            System.out.println("Ingresa el apellido");
            String apellido = leer.next();
            System.out.println("Ingresa la edad");
            int edad = leer.nextInt();
            //introduzco los datos
            lista[i].setNombre(nombre);
            lista[i].setApellido(apellido);
            lista[i].setEdad(edad);
        }
        //MUESTRO LAS INSTANCIAS
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        //COMPRUEBO QUIEN ES EL ALUMNO MÁS JOVEN
        int aux=lista[0].getEdad();
        String sujeto=null;
        String sujetoap=null;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].getEdad()<aux){
                aux=lista[i].getEdad();
                sujeto=lista[i].getNombre();
                sujetoap=lista[i].getApellido();
            }
        }
        System.out.println("El alumno más joven es %s %s con %d años".formatted(sujeto,sujetoap,aux));
        //COMPRUEBO EL ALUMNO MÁS VIEJO
//        int inicio=lista[0].getEdad();
//        String sujetoNombre=null;
//        String sujetoApellido=null;
//        for (int i = 0; i < lista.length; i++) {
//            if(lista[i].getEdad()>inicio){
//                aux=lista[i].getEdad();
//                sujeto=lista[i].getNombre();
//                sujetoap=lista[i].getApellido();
//            }
//        }
//        System.out.println("El alumno más viejo es "+sujetoNombre+" "+sujetoApellido+" con la edad "+ inicio);
    }
}
