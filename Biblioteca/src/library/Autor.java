package library;

import java.util.ArrayList;

public class Autor {
    int id;
    String nombre;
    String apellido1;
    String apellido2;
    String email;
    Biblioteca biblioteca;

    ArrayList<Libro> Book = new ArrayList<Libro>();

    public Autor(){}
    public Autor (String nombre, String apellido1, String apellido2, String email){
        setId();
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setEmail(email);
    }
    public String getNombreCita(){
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId() {
        int digito1=(int)(Math.random()*1000);
        this.id = digito1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBook(ArrayList<Libro> book) {
        Book = book;
    }

    public ArrayList<Libro> getBook() {
        return Book;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    @Override
    public String toString (){
        return "idUser=%d,nameUser=%s,surname1User=%s,surname2User=%s,email=%s".formatted(getId(),getNombre(),getApellido1(),getApellido2(),getEmail());
    }
}