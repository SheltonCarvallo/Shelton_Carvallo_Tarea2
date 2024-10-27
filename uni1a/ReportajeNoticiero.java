package uni1a;

import java.util.ArrayList;

public class ReportajeNoticiero extends ContenidoAudiovisual{
    private  String seccion;
    private final ArrayList<Reportero> reporteros;

    public ReportajeNoticiero(String titulo, int duracionEnMinutos, String genero, String seccion, ArrayList<Reportero> reporteros) {
        super(titulo, duracionEnMinutos, genero);
        this.seccion = seccion;
        this.reporteros = reporteros;
    }

    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(){
        this.seccion = seccion;
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

    public void addReportero(Reportero reportero){
        reporteros.add(reportero);
    }

    public void removeReportero(Reportero reportero) {
        reporteros.remove(reportero);
    }

    public int contarReporteros() {
        return reporteros.size();
    }
    public String mostrarResumen() {
        return "Título: " + getTitulo() + ", Duración: " + getDuracionEnMinutos() + " minutos, Sección: " + seccion;
    }

}
