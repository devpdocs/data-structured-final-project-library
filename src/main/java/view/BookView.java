/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.BookController;
import dto.Generic;
import interfaces.MaterialType;
import java.util.Scanner;
import model.BookModel;

/**
 *
 * @author arqua
 */
public class BookView {

    static Scanner scan = new Scanner(System.in);

    static BookController controller = new BookController();

    public static void insertBook() throws IllegalAccessException {

        char sw;
        
        do {
            
            System.out.println("\nIngrese el Titulo de libro: ");
            scan.next();
            String title = scan.nextLine();

            System.out.println("Ingrese el Nombre del autor: ");
            String author = scan.nextLine();

            System.out.println("Ingrese el Año de publicacion: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;

            System.out.println("Ingrese la Casa editorial: ");
            String editorial = scan.nextLine();

            System.out.println("Ingrese el Numero de paginas: ");
            int nPages = scan.nextInt();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();
           

            BookModel book = new BookModel(
                    "",
                    nPages,
                    title,
                    author,
                    editorial,
                    publishedYear,
                    MaterialType.BOOK,
                    availableArticle,
                    "",
                    "",
                    copies
            );
            
            Generic<BookModel> obj = new Generic<>();
            obj.setContent(book);
           
            System.out.println("\nDesea ingresar otro Libro (S/N): ");
            sw = scan.next().toUpperCase().charAt(0);
            
             
             
            if(controller.insertArticle(obj.getContent(), sw) != null){
                System.out.println("La información ha sido insertada correctamente!!");
            } else {
                System.out.println("Ha habido un error, por favor intentalo de nuevo");
            }
           
           
        } while (sw == 'S');

    }

    public static void updateBook() throws IllegalAccessException {

        
        
        System.out.println("""
                           Por favor para actualizar: 
                           
                            debes de ingresar de nuevos los datos""");

        

            System.out.println("\nIngrese el Titulo de libro: ");
            scan.next();
            String title = scan.nextLine();

            System.out.println("Ingrese el Nombre del autor: ");
            String author = scan.nextLine();

            System.out.println("Ingrese el Año de publicacion: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;

            System.out.println("Ingrese la Casa editorial: ");
            String editorial = scan.nextLine();

            System.out.println("Ingrese el Numero de paginas: ");
            int nPages = scan.nextInt();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();
            
            System.out.println("Ingrese el id: ");
            String id = scan.next();

            BookModel book = new BookModel(
                    id,
                    nPages,
                    title,
                    author,
                    editorial,
                    publishedYear,
                    MaterialType.BOOK,
                    availableArticle,
                    "",
                    "",
                    copies
            );

            Generic<BookModel> obj = new Generic<>();
            obj.setContent(book);
            

            if (controller.updatedArticle(obj.getContent()) != null) {
                System.out.println("El articulo ha sido actualizado correctamente");
            } else {
                System.out.println("El articulo no se encuentra en el sistema");
            }

       
    }

    public static void removeBook() {

        System.out.println("Por favor, ingrese el ID del libro que desea borrar: ");
        int id = scan.nextInt();
        scan.next();

        System.out.println("Ha ingresado el ID: " + id);
        System.out.println("¿Está seguro de que desea borrar este libro? (S/N): ");
        String confirmacion = scan.next().toUpperCase();

        if (confirmacion.equalsIgnoreCase("S")) {
            System.out.println("El libro con ID " + id + " ha sido eliminado.");

        } else {
            System.out.println("Operación cancelada. El libro no ha sido borrado.");
        }
    }

    public static void listBook() {

        System.out.println("Por favor, ingrese el ID del libro que desea listar: ");
        int id = scan.nextInt();
        scan.next();

        System.out.println("Ha ingresado el ID: " + id);
        System.out.println("¿Está seguro de que desea listar este libro? (S/N): ");
        String confirmacion = scan.next().toUpperCase();

        if (confirmacion.equalsIgnoreCase("S")) {
            System.out.println("El libro con ID " + id + " ha sido listado.");

        } else {
            System.out.println("Operación cancelada.");
        }

    }

    public static void listBooks() {

    }

}
