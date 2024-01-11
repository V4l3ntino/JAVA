package library;

public class Utilidades {
    public String generarCodigoLibro(){
        String codigo = "LL";
        int digito=(int)(Math.random()*999);
        return codigo+digito;
    }
}
