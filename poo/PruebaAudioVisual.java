package poo;

import uni1a.*;

import java.util.ArrayList;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        //contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        //contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);

        ArrayList<Actor> actoresAvatar = new ArrayList<Actor>();
        actoresAvatar.add(new Actor("Sam", "Worthington"));
        actoresAvatar.add(new Actor("Zoe", "Saldana"));

        ArrayList<Temporada> temporadasGameOfThrones = new ArrayList<Temporada>();
        temporadasGameOfThrones.add(new Temporada("DragonesT1", 1, 10));
        temporadasGameOfThrones.add(new Temporada("DragonesT2", 2, 12));
        temporadasGameOfThrones.add(new Temporada("DragonesT3", 3, 8));

        ArrayList<Investigador> investigadoresCosmos = new ArrayList<Investigador>();
        investigadoresCosmos.add(new Investigador("Shelton", "Carvallo"));
        investigadoresCosmos.add(new Investigador("Ivonne", "Rubira"));

        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actoresAvatar);
        contenidos[1] = new Documental("Cosmos", 45, "Science", "Astronomy", investigadoresCosmos);
        contenidos[2] = new SerieDeTV("Game of Thrones", 6860, "Fantasy", 8, temporadasGameOfThrones);
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println();
        }

    }
}