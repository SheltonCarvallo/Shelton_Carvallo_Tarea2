/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.TreeMap;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private final ArrayList<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, ArrayList<Temporada> listaTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = listaTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie tv:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        mostrarTemporadas();
    }

    public void mostrarTemporadas() {
        for (Temporada temporada : listaTemporadas) {
            System.out.println("\t- " + "Número temporada: " + temporada.getNumeroTemporada() + " Nombre: " + temporada.getNombre()
                    + "  No Capitulos: " + temporada.getCapitulos()
            );
        }
    }
}