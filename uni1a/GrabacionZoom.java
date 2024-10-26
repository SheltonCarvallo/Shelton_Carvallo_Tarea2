package uni1a;

import java.util.ArrayList;

public class GrabacionZoom extends ContenidoAudiovisual {

    private final String descripcion;
    private final ArrayList<Participante> participantes;

    public GrabacionZoom(String titulo, int duracionEnMinutos, String genero, String descripcion, ArrayList<Participante> participantes) {
        super(titulo, duracionEnMinutos, genero);
        this.descripcion = descripcion;
        this.participantes = participantes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles grabacion zoom:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Investigadores:");
        mostrarParticipantes();
    }

    public void mostrarParticipantes() {
        for (Participante participante : participantes) {
            System.out.println("\t- " + participante.getNombre() + " " + participante.getApellido());
        }
    }

}

