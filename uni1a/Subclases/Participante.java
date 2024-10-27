package uni1a.Subclases;

public class Participante {
    private String nombre;
    private String apellido;
    private String rol;


    public Participante(String nombre, String apellido, String rol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }

    //Getters and Setters
    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){

        return nombre;
    }
    public void setApellido(String apellido){

        this.apellido = apellido;
    }
    public String getApellido(){

        return apellido;
    }
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
}
