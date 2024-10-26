package uni1a;

public class Reportero {
    private String nombre;
    private String apellido;


    public Reportero(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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
}
