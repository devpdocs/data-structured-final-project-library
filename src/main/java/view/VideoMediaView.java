
package view;

import controller.VideoMediaController;
import dto.Generic;
import interfaces.MaterialType;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import model.VideoMediaModel;

/**
 *
 * @author arqua
 */
public class VideoMediaView {
    
    private static Scanner scan = new Scanner(System.in);
    static VideoMediaController controller = new VideoMediaController();
    
    public static void updateVideoMedia()throws IllegalAccessException {
        
          char sw;
        
        
          
            System.out.println("Ingrese el Titulo del Video: ");
            scan.next();
            String title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            scan.next();
            String author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            scan.next();
            String materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            scan.next();
            String publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;
            
            System.out.println("Ingrese la Casa editorial: ");
            scan.next();
            String editorial = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de horas con minutos. HH:MM:  ");
            scan.next();
            String hours = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias del video:  ");
            scan.next();
            int ncopy = scan.nextInt();
            
            System.out.println("Ingrese el ID para el Video: ");
            scan.next();
            int id = scan.nextInt();
        
            VideoMediaModel  videomedia = new VideoMediaModel(
                    0,
                    title, 
                    author, 
                    editorial, 
                    publishedYear, 
                    MaterialType.VIDEO_MEDIA, 
                    availableArticle, 
                    "", 
                    "", 
                    ncopy
            );
            
            Generic<VideoMediaModel> obj = new Generic<>();
            obj.setContent(videomedia);
           
            System.out.println("\nDesea actualizar otro Video (S/N): ");
             sw = scan.next().toUpperCase().charAt(0);
            ArrayList<VideoMediaModel> insertArticle = controller.insertArticle(obj.getContent(), sw);  

        
//        System.out.println("Actualización completada:");
//        System.out.println("Título: " + title);
//        System.out.println("Autor: " + author);
//        System.out.println("Tipo de material: " + materialType);
//        System.out.println("Año de publicación: " + publishedYear);
//        System.out.println("Disponible: " + availableArticle);
//        System.out.println("Editorial: " + editorial);
//        System.out.println("Número de Horas: " + hours);
//        System.out.println("Número de Copias: " + copies);
//        System.out.println("ID: " + id);

        
          
    } 
    
    public static void insertVideoMedia()throws IllegalAccessException {
        
        
          
          
          
        char sw;
        
        do {
          
            System.out.println("Ingrese el Titulo del Video: ");
            scan.next();
            String title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            scan.next();
            String author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            scan.next();
            String materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            scan.next();
            String publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;
            
            System.out.println("Ingrese la Casa editorial: ");
            scan.next();
            String editorial = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de horas con minutos. HH:MM:  ");
            scan.next();
            String hours = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias del video:  ");
            scan.next();
            int ncopy = scan.nextInt();
            
            System.out.println("Ingrese el ID para el Video: ");
            scan.next();
            int id = scan.nextInt();
        
            VideoMediaModel  videomedia = new VideoMediaModel(
                    0,
                    title, 
                    author, 
                    editorial, 
                    publishedYear, 
                    MaterialType.VIDEO_MEDIA, 
                    availableArticle, 
                    "", 
                    "", 
                    ncopy
            );
            
            Generic<VideoMediaModel> obj = new Generic<>();
            obj.setContent(videomedia);
           
            System.out.println("\nDesea ingresar otro Video (S/N): ");
             sw = scan.next().toUpperCase().charAt(0);
            ArrayList<VideoMediaModel> insertArticle = controller.insertArticle(obj.getContent(), sw);
            
            
            } while (sw == 'S');
            
    } 
    
    public static void removeVideoMedia() {
        
        System.out.println("Por favor, ingrese el ID del Video que desea borrar: ");
    int id = scan.nextInt();
    scan.nextLine();

    
    System.out.println("Ha ingresado el ID: " + id);
    System.out.println("¿Está seguro de que desea borrar este Video? (S/N): ");
    String confirmacion = scan.nextLine().toUpperCase();

    
    if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("El Video con ID " + id + " ha sido eliminado.");
        
    } else {
        System.out.println("Operación cancelada. El Video no ha sido borrado.");
    }
    
    
    }
    
    
    public static void listVideoMedia() {
        
        System.out.println("Por favor, ingrese el ID del  Video que desea listar: ");
        int id = scan.nextInt();
    scan.nextLine();

    
        System.out.println("Ha ingresado el ID: " + id);
        System.out.println("¿Está seguro de que desea listar este Video? (S/N): ");
        String confirmacion = scan.nextLine().toUpperCase();

     
        if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("El Video con ID " + id + " ha sido listado.");
        
        } else {
        System.out.println("Operación cancelada.");
        }
        
    }
     
    
    public static void listMagazines() {
        
        
        
    }
        
    
    
    public static void listVideoMedias() {
        
        
        
    }
    
}
