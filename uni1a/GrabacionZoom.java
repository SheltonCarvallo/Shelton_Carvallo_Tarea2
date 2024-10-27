package uni1a;

import java.util.ArrayList;

public class GrabacionZoom extends ContenidoAudiovisual {

    private String descripcion;
    private final ArrayList<Participante> participantes;

    public GrabacionZoom(String titulo, int duracionEnMinutos, String genero, String descripcion, ArrayList<Participante> participantes) {
        super(titulo, duracionEnMinutos, genero);
        this.descripcion = descripcion;
        this.participantes = participantes;
    }


    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(){
        this.descripcion = descripcion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles grabacion zoom:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Participantes:");
        mostrarParticipantes();
    }

    public void mostrarParticipantes() {
        for (Participante participante : participantes) {
            System.out.println("\t- " + participante.getNombre() + " " + participante.getApellido() + " rol:" + participante.getRol());
        }
    }
    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void removeParticipante(Participante participante) {
        participantes.remove(participante);
    }

    public int contarParticipantes() {
        return participantes.size();
    }

    public ArrayList<Participante> filtrarPorRol(String rol) {
        ArrayList<Participante> filtrados = new ArrayList<>();
        for (Participante participante : participantes) {
            if (participante.getRol().equalsIgnoreCase(rol)) {
                filtrados.add(participante);
            }
        }
        return filtrados;
    }



}

