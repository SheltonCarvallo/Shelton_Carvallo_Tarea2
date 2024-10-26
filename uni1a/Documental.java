/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private final ArrayList<Investigador> investigadores;


    public Documental(String titulo, int duracionEnMinutos, String genero, String tema,ArrayList<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores:");
        mostrarInvestigadores();
    }

    public void mostrarInvestigadores(){
        for(Investigador investigador : investigadores)
        {
            System.out.println("\t- " + investigador.getNombre() + " " + investigador.getApellido());
        }
    }

}