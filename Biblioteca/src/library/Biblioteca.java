package library;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
    String nombre;
    public ArrayList<Libro> Book = new ArrayList<Libro>();
    public ArrayList<Autor> Writer = new ArrayList<Autor>();
    Scanner read = new Scanner(System.in);
    App index = new App();

    public Biblioteca(String nombre){
        setNombre(nombre);
    }

    public static void main (String[] args){
        App index = new App();
        index.menu();
    }
    public void addLibro(){
        var LibroObj = new Libro();
        //Entrada de datos
        boolean aux = true;
        do {
            System.out.println("Introduzca el título del libro");
            String tituloLibro = read.nextLine();
            System.out.println("Introduzca el autor del libro");
            String autorLibro = read.nextLine();
            System.out.println("Introduzca el año del libro");
            int anioLibro = read.nextInt();

            //COMPROBAR AUTOR
            for (Autor autor : getWriter()){
                if(autor.getNombre().equals(autorLibro)){
                    LibroObj = new Libro(tituloLibro,autor,anioLibro);
                    Book.add(LibroObj);
//                    aux = true;
                    break;
                }else{
                    aux = false;
                }
                if(!aux){
                    System.out.println("El libro no se puede crear porque no existe el autor");
                }
            }
        }while(!aux);
        read.close();
        index.menu();
    }
    public void addAutor(){
        var AutorObj = new Autor();
        //Entrada de datos
        System.out.println("Introduzca el nombre del Autor");
        String nombreAutor = read.nextLine();
        System.out.println("Introduzca el primer apellido");
        String apellido1Autor = read.nextLine();
        System.out.println("Introduzca el segundo apellido");
        String apllido2Autor = read.nextLine();
        System.out.println("Introduzca el correo del autor");
        String correoAutor = read.nextLine();
        AutorObj = new Autor(nombreAutor, apellido1Autor, apllido2Autor, correoAutor);
        Writer.add(AutorObj);
        read.close();
        index.menu();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBook(ArrayList<Libro> book) {
        Book = book;
    }

    public void setWriter(ArrayList<Autor> writer) {
        Writer = writer;
    }

    public ArrayList<Libro> getBook() {
        return Book;
    }

    public ArrayList<Autor> getWriter() {
        return Writer;
    }

    @Override
    public String toString(){
        return getNombre();
    }

    public boolean prestarLibro(){
        return false;
    }
    public boolean devolverLibro(){
        return false;
    }

    public void listarLibro(){}

    public void listarAutores(){}
}
