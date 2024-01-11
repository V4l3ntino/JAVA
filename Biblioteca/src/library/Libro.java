package library;

public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int anio;
//    Boolean prestado;
    private Biblioteca biblioteca;

    public Libro(){};
    public Libro (String titulo, Autor autor ,int anio){
        setCodigo();
        setTitulo(titulo);
        setAutor(autor);
        setAnio(anio);
    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo() {
        Utilidades utilidad = new Utilidades();
        this.codigo = utilidad.generarCodigoLibro();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString(){
        return "El Titulo es %s el codigo es %s y el anio es %d de la biblioteca ".formatted(getTitulo(),getCodigo(),getAnio())+getBiblioteca();
    }


}
