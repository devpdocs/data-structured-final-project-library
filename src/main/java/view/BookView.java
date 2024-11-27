/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.BookController;
import dto.Generic;
import interfaces.MaterialType;
import java.net.URISyntaxException;
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

    public static void updateBook() throws IllegalAccessException {
        char sw;
        
            System.out.println("\nIngrese el ID del libro: ");
            scan.next();
            int id = scan.nextInt();

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