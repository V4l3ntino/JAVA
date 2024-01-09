package alumnos;

public class Alumnos {
    String nombre;
    String apellido;
    int edad;
    String email;
    int telefono;

    public Alumnos(){}
    public Alumnos(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    public Alumnos(String nombre, String apellido, int edad, String email, int telefono){
        this(nombre,apellido,edad);
        this.email=email;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String comprobarEdad(){
        String message;
        if (getEdad()<=18){
            message = "El sujeto "+getNombre()+" es tan petit!!!!";
            return message;
        }else{
            message = "El sujeto "+getNombre()+" es adulto y tiene pelos";
            return message;
        }
    }

    @Override
    public String toString(){
     return "[nombre="+ getNombre() +",apellido="+ getApellido() +",edad="+ getEdad() +",email="+ getEmail() +",telefono="+ getTelefono() +"]";
    }
}

