/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.MagazineController;
import dto.Generic;
import interfaces.MaterialType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MagazineModel;


/**
 *
 * @author arqua
 */
public class MagazineView {
    
    
     static Scanner scan = new Scanner(System.in);

    static MagazineController controller = new MagazineController();
    
    public static void insertMagazine() {
        
        char sw;

        do {

            scan.nextLine();
            System.out.println("Ingrese el Titulo de la revista: ");
            String title = scan.nextLine();

            System.out.println("Ingrese el nombre de la distribuidora: ");
            String author = scan.nextLine();

            System.out.println("El año de publicación: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

            System.out.println("Ingrese el estudio la editorial: ");
            String editorial = scan.nextLine();

            System.out.println("ingrese el genero de la revista: ");
            String gender = scan.nextLine();
            
            System.out.println("ingrese la marca de la revista: ");
            String brand = scan.nextLine();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();
           


            MagazineModel magazineModel = new MagazineModel(
                    
                    brand,
                    gender,
                    "",
                    title,
                    author,
                    editorial,
                    publishedYear,
                    MaterialType.MAGAZINE,
                    availableArticle,
                    "",
                    "",
                    copies
            );

            Generic<MagazineModel> obj = new Generic<>();
            obj.setContent(magazineModel);

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

            System.out.println("\nDesea ingresar otra revista (S/N): ");
            sw = scan.next().toUpperCase().charAt(0);

        } while (sw == 'S');
        
    } 
    
    public static void updateMagazine() {
        
        System.out.println("""
                           Por favor para actualizar: 
                           
                            debes de ingresar de nuevos los datos""");
        System.out.println("Ingrese el id: ");
        String id = scan.nextLine();
        
        System.out.println("Ingrese el Titulo de la revista: ");
            String title = scan.nextLine();

            System.out.println("Ingrese el nombre de la distribuidora: ");
            String author = scan.nextLine();

            System.out.println("El año de publicación: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

            System.out.println("Ingrese el estudio la editorial: ");
            String editorial = scan.nextLine();

            System.out.println("ingrese el genero de la revista: ");
            String gender = scan.nextLine();
            
            System.out.println("ingrese la marca de la revista: ");
            String brand = scan.nextLine();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();
            
            
            
            MagazineModel magazineModel = new MagazineModel(
                    
                    brand,
                    gender,
                    id,
                    title,
                    author,
                    editorial,
                    publishedYear,
                    MaterialType.MAGAZINE,
                    availableArticle,
                    "",
                    "",
                    copies
            );

            Generic<MagazineModel> obj = new Generic<>();
            obj.setContent(magazineModel);
            
            
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
                System.out.println("No se ha encontrado una revista con el id: \n"
                        + " id: " + obj.getContent().getId() + "\n"
                );
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MagazineView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
    } 
    
    
    
    public static void removeMagazine() {
        
        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID de la revista que desea eliminar: ");
            String id = scan.nextLine();

            if (controller.removedArticle(id)) {
                System.out.println("\nLa revista con el ID: " + id + " Ha sido eliminado");
            } else {
                System.out.println("\nLa revista con el ID: " + id + " no ha sido eliminado");
                System.out.println("\nPor favor verifiqué el ID");
            }

            System.out.println("Desea Eliminar una revista más S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');
    } 
    
    public static void listMagazine() {
        
        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID de la revista que desea listar: ");
            String id = scan.nextLine();

            if (controller.getArticle(id) != null) {
                LinkedHashMap<String, Object> magazine = (LinkedHashMap<String, Object>) controller.getArticle(id);

                magazine.forEach((k, v) -> System.out.println("\n" + k + ": " + v + "\n"
                        + "________________"));

            }

            System.out.println("Desea Consultar una revista más? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');
        
    }
     
    
    public static void listMagazines() {
        
        char sw;

        do {

            if (controller.getArticles() != null) {
                ArrayList<LinkedHashMap<String, Object>> magazine = controller.getArticles();

                for (LinkedHashMap<String, Object> video : magazine) {
                    video.forEach((k, v) -> System.out.println("" + k + ": " + v + "\n"
                            + "________________"));
                    System.out.println("======================================");
                }

            }

            System.out.println("Quieres consultar las revistas otra vez? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');
        
    }
    
}
