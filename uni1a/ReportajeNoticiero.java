package uni1a;

import java.util.ArrayList;

public class ReportajeNoticiero extends ContenidoAudiovisual{
    private final String seccion;
    private final ArrayList<Reportero> reporteros;

    public ReportajeNoticiero(String titulo, int duracionEnMinutos, String genero, String seccion, ArrayList<Reportero> reporteros) {
        super(titulo, duracionEnMinutos, genero);
        this.seccion = seccion;
        this.reporteros = reporteros;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles reportaje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Sección: " + this.seccion);
        System.out.println("Reporteros:");
        mostrarReporteros();
    }

    public void mostrarReporteros(){
        for(Reportero reportero : reporteros)
        {
            System.out.println("\t- " + reportero.getNombre() + " " + reportero.getApellido());
        }
    }
}
