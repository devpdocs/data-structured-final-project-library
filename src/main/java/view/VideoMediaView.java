package view;

import dto.Generic;
import interfaces.MaterialType;
import java.util.Scanner;
import controller.VideoMeidaController;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.VideoMediaModel;

/**
 *
 * @author arqua
 */
public class VideoMediaView {

    static Scanner scan = new Scanner(System.in);

    static VideoMeidaController controller = new VideoMeidaController();

    public static void insertVideoMedia() {

        char sw;

        do {

            scan.nextLine();
            System.out.println("Ingrese el Titulo de Material Videografico: ");
            String title = scan.nextLine();

            System.out.println("Ingrese el Nombre del director: ");
            String author = scan.nextLine();

            System.out.println("Ingrese el Año de Lanzamiento: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

            System.out.println("Ingrese el estudio de grabación: ");
            String editorial = scan.nextLine();

            System.out.println("Ingrese la cantidad de horas que dura el largometraje: ");
            String hours = scan.nextLine();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();

            VideoMediaModel videoMedia;
            videoMedia = new VideoMediaModel(
                    hours,
                    "",
                    title,
                    author,
                    editorial,
                    publishedYear,
                    MaterialType.VIDEO_MEDIA,
                    availableArticle,
                    "",
                    "",
                    copies
            );

            Generic<VideoMediaModel> obj = new Generic<>();
            obj.setContent(videoMedia);

            try {
                if (controller.insertArticle(obj.getContent())) {
                    System.out.println("La información ha sido insertada correctamente!!");
                    System.out.println("El libro: \n"
                            + " id: " + obj.getContent().getId() + "\n"
                            + " title: " + obj.getContent().getTitle() + "\n"
                            + " author " + obj.getContent().getAuthor() + "\n"
                            + " editorial " + obj.getContent().getEditorial() + "\n"
                            + " Ha sido Agregado Correctamente"
                    );
                } else {
                    System.out.println("Ha habido un error, por favor intentalo de nuevo");
                }
            } catch (IllegalAccessException ex) {
                Logger.getLogger(VideoMediaView.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("\nDesea ingresar otro Libro (S/N): ");
            sw = scan.next().toUpperCase().charAt(0);

        } while (sw == 'S');

    }

    public static void updateVideoMedia() {
        System.out.println("""
                           Por favor para actualizar: 
                           
                            debes de ingresar de nuevos los datos""");

        System.out.println("Ingrese el id: ");
        String id = scan.nextLine();

        System.out.println("Ingrese el Titulo de Material Videografico: ");
        String title = scan.nextLine();

        System.out.println("Ingrese el Nombre del director: ");
        String author = scan.nextLine();

        System.out.println("Ingrese el Año de Lanzamiento: ");
        String publishedYear = scan.nextLine();

        System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
        String isAvailable = scan.nextLine();
        var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

        System.out.println("Ingrese el estudio de grabación: ");
        String editorial = scan.nextLine();

        System.out.println("Ingrese la cantidad de horas que dura el largometraje: ");
        String hours = scan.nextLine();

        System.out.println("Ingrese el Numero de copias: ");
        int copies = scan.nextInt();

        VideoMediaModel videoMedia;
        videoMedia = new VideoMediaModel(
                hours,
                id,
                title,
                author,
                editorial,
                publishedYear,
                MaterialType.VIDEO_MEDIA,
                availableArticle,
                "",
                "",
                copies
        );

        Generic<VideoMediaModel> obj = new Generic<>();
        obj.setContent(videoMedia);

        try {
            if (controller.updatedArticle(obj.getContent())) {
                System.out.println("El libro: \n"
                        + " id: " + obj.getContent().getId() + "\n"
                        + " title: " + obj.getContent().getTitle() + "\n"
                        + " author " + obj.getContent().getAuthor() + "\n"
                        + " editorial " + obj.getContent().getEditorial() + "\n"
                        + " Ha sido Actualizado Correctamente"
                );
            } else {
                System.out.println("El articulo no se encuentra en el sistema");
                System.out.println("No se ha encontrado un material Videografic con el id: \n"
                        + " id: " + obj.getContent().getId() + "\n"
                );
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VideoMediaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listVideoMedia() {
        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID del video que desea listar: ");
            String id = scan.nextLine();

            if (controller.getArticle(id) != null) {
                LinkedHashMap<String, Object> videoMedia = (LinkedHashMap<String, Object>) controller.getArticle(id);

                videoMedia.forEach((k, v) -> System.out.println("\n" + k + ": " + v + "\n"
                        + "________________"));

            }

            System.out.println("Desea Consultar un video más? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');

    }

    public static void listVideoMedias() {
        char sw;

        do {

            if (controller.getArticles() != null) {
                ArrayList<LinkedHashMap<String, Object>> videos = controller.getArticles();

                for (LinkedHashMap<String, Object> video : videos) {
                    video.forEach((k, v) -> System.out.println("" + k + ": " + v + "\n"
                            + "________________"));
                    System.out.println("======================================");
                }

            }

            System.out.println("Quieres consultar los videos otra vez? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');

    }

    public static void removeVideoMedia() {

        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID del video que desea eliminar: ");
            String id = scan.nextLine();

            if (controller.removedArticle(id)) {
                System.out.println("\nEl video con el ID: " + id + " Ha sido eliminado");
            } else {
                System.out.println("\nEl vide con el ID: " + id + " no ha sido eliminado");
                System.out.println("\nPor favor verifiqué el ID");
            }

            System.out.println("Desea Eliminar un video más S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');

    }

}
