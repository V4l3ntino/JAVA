import alumnos.Alumnos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Alumnos[] lista = new Alumnos[5];

        lista[0] = new Alumnos("Pedro","Jimenez",19,"pedro19@gmail.com",823491);
        lista[1] = new Alumnos("Maria", "Egea", 44, "maria34@gmail.com",293949);
        lista[2] = new Alumnos("Marco", "Aurelio", 100, "marcoaurelio@gmail.com", 12345);
        lista[3] = new Alumnos("Melchor", "Gaspar", 1111, "melchor@gmail.com", 12345);
        lista[4] = new Alumnos("Sancho", "Panza", 3,"escomofucknopuedoestarmuchotiempoaquisabes@gmail.com", 1234567);


        for (int i = 0; i < lista.length  ; i++) {
            System.out.println(lista[i]);
        }
        int aux=lista[0].getEdad();
        String sujeto=null;
        String sujetoap=null;
        String correo=null;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].getEdad()<aux){
                aux=lista[i].getEdad();
                sujeto=lista[i].getNombre();
                sujetoap=lista[i].getApellido();
                correo=lista[i].getEmail();
            }
        }
        System.out.println("El alumno más joven es %s %s con %d años y correo %s".formatted(sujeto,sujetoap,aux,correo));
    }
}