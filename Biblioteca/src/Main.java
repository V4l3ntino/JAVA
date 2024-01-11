import library.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws Exception{
       Biblioteca biblio = new Biblioteca("IESCURAVALERA");
       Scanner read = new Scanner(System.in);
        //CREAR MENU
       int opcion;
       do {
           System.out.println(" 1.Añadir autores \n 2.Añadir libros \n 3.Listar libros \n 4.Prestar libros \n 5.Devolver libros \n 6.Salir \n Elige una opción");
           opcion = read.nextInt();
           if (opcion < 1 || opcion > 6){
               System.out.println("Debes introducir un número entre el 1 y el 6");
           }
       } while (opcion < 1 || opcion > 6);

       switch (opcion){
           case 1:
               biblio.addAutor();
               break;
           case 2:
               biblio.addLibro();
               break;
           case 3:
               biblio.listarLibro();
               break;
           case 4:
               biblio.prestarLibro();
               break;
           case 5:
               biblio.devolverLibro();
               break;
           case 6:
               System.exit(0);
               break;
       }



    }
}
