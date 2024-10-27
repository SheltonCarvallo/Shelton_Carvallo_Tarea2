package poo;

import uni1a.Subclases.GrabacionZoom;
import uni1a.Subclases.Participante;
import uni1a.Subclases.ReportajeNoticiero;
import uni1a.Subclases.Reportero;

import java.util.ArrayList;

public class PruebaSubclases {
    public static void main(String[] args) {
        System.out.println("----------------------------SubClase 1----------------------------");
        ArrayList<Participante> listaParticipantes = new ArrayList<>();

        // Crear y agregar participantes a la lista
        Participante p1 = new Participante("Juan", "Pérez", "Orador");
        Participante p2 = new Participante("María", "Gómez", "Asistente");
        Participante p3 = new Participante("Pedro", "López", "Moderador");

        listaParticipantes.add(p1);
        listaParticipantes.add(p2);
        listaParticipantes.add(p3);

        // Crear la instancia de GrabacionZoom
        GrabacionZoom grabacion = new GrabacionZoom("Reunión de Proyecto", 60, "Educativo", "Revisión de avances del proyecto", listaParticipantes);

        // Mostrar los detalles de la grabación
        grabacion.mostrarDetalles();

        // Contar el número de participantes
        System.out.println("Cantidad de participantes: " + grabacion.contarParticipantes());

        // Filtrar participantes por rol
        ArrayList<Participante> oradores = grabacion.filtrarPorRol("Orador");
        System.out.println("Oradores en la grabación:");
        for (Participante orador : oradores) {
            System.out.println("\t- " + orador.getNombre() + " " + orador.getApellido());
        }

        // Agregar un nuevo participante
        Participante p4 = new Participante("Laura", "Martínez", "Asistente");
        grabacion.addParticipante(p4);
        System.out.println("Después de agregar un participante:");
        grabacion.mostrarDetalles();

        // Remover un participante
        grabacion.removeParticipante(p2);
        System.out.println("Después de remover un participante:");
        grabacion.mostrarDetalles();

        System.out.println("----------------------------SubClase 2----------------------------");
        //Subclase 2
        ArrayList<Reportero> listaReporteros = new ArrayList<>();

        // Crear y agregar reporteros a la lista
        Reportero r1 = new Reportero("Carlos", "Méndez");
        Reportero r2 = new Reportero("Ana", "Ramírez");
        Reportero r3 = new Reportero("Luis", "Martínez");

        listaReporteros.add(r1);
        listaReporteros.add(r2);
        listaReporteros.add(r3);

        // Crear la instancia de ReportajeNoticiero
        ReportajeNoticiero reportaje = new ReportajeNoticiero("Reporte del Clima", 10, "Noticiero", "Clima", listaReporteros);

        // Mostrar los detalles del reportaje
        reportaje.mostrarDetalles();

        // Contar el número de reporteros
        System.out.println("Cantidad de reporteros: " + reportaje.contarReporteros());

        // Mostrar un resumen del reportaje
        System.out.println("Resumen del reportaje: " + reportaje.mostrarResumen());

        // Agregar un nuevo reportero
        Reportero r4 = new Reportero("Silvia", "Torres");
        reportaje.addReportero(r4);
        System.out.println("Después de agregar un nuevo reportero:");
        reportaje.mostrarDetalles();

        // Remover un reportero
        reportaje.removeReportero(r2);
        System.out.println("Después de remover un reportero:");
        reportaje.mostrarDetalles();

    }
}
