/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.BookController;
import dto.Generic;
import interfaces.MaterialType;
import java.time.LocalDate;
import java.util.ArrayList;
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
            
            System.out.println("Ingrese el Titulo de libro: ");
            String title = scan.next();

            System.out.println("Ingrese el Nombre del autor: ");
            String author = scan.next();

            System.out.println("Ingrese el Año de publicacion: ");
            String publishedYear = scan.next();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.next();
            boolean availableArticle = isAvailable.equals('S') ? true : false;

            System.out.println("Ingrese la Casa editorial: ");
            String editorial = scan.next();

            System.out.println("Ingrese el Numero de paginas: ");
            int nPages = scan.nextInt();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();
           

            BookModel book = new BookModel(
                    0,
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
            ArrayList<BookModel> insertArticle = controller.insertArticle(obj.getContent(), sw);
            
            

           
        } while (sw == 'S');

    }

    public static void updateBook() {

        String title;
        String author;
        String materialType;
        String publishedYear;
        boolean availableArticle;
        String editorial;
        int nPages;
        int id;
        int copies;

        do {
            System.out.println("¿Desea actualizar el Título del libro? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Título: ");
                title = scan.next();
            }

            System.out.println("¿Desea actualizar el Autor? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Autor: ");
                author = scan.next();
            }

            System.out.println("¿Desea actualizar el Tipo de material? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Tipo de material: ");
                materialType = scan.next();
            }

            System.out.println("¿Desea actualizar el Año de publicación? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Año de publicación: ");
                publishedYear = scan.next();
            }

            System.out.println("¿Desea actualizar la disponibilidad? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese si está disponible (true/false): ");
                availableArticle = scan.nextBoolean();
                scan.next();
            }

            System.out.println("¿Desea actualizar la Editorial? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese la nueva Editorial: ");
                editorial = scan.next();
            }

            System.out.println("¿Desea actualizar el Número de páginas? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Número de páginas: ");
                nPages = scan.nextInt();
                scan.next();
            }

            System.out.println("¿Desea actualizar el Número de copias? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo Número de páginas: ");
                copies = scan.nextInt();
                scan.next();
            }

            System.out.println("¿Desea actualizar el ID del libro? (S/N): ");
            if (scan.next().equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo ID: ");
                id = scan.nextInt();
                scan.next();
            }

        } while (scan.next().equalsIgnoreCase("S"));

//        System.out.println("Actualización completada:");
//        System.out.println("Título: " + title);
//        System.out.println("Autor: " + author);
//        System.out.println("Tipo de material: " + materialType);
//        System.out.println("Año de publicación: " + publishedYear);
//        System.out.println("Disponible: " + availableArticle);
//        System.out.println("Editorial: " + editorial);
//        System.out.println("Número de páginas: " + nPages);
//        System.out.println("Número de copias: " +  copies);
//        System.out.println("ID: " + id);
        scan.close();
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
