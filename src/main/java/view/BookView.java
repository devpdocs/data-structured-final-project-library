/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.BookController;
import dto.Generic;
import interfaces.MaterialType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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

            scan.nextLine();
            System.out.println("Ingrese el Titulo de libro: ");
            String title = scan.nextLine();

            System.out.println("Ingrese el Nombre del autor: ");
            String author = scan.nextLine();

            System.out.println("Ingrese el Año de publicacion: ");
            String publishedYear = scan.nextLine();

            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

            System.out.println("Ingrese la Casa editorial: ");
            String editorial = scan.nextLine();

            System.out.println("Ingrese el Numero de paginas: ");
            int nPages = scan.nextInt();

            System.out.println("Ingrese el Numero de copias: ");
            int copies = scan.nextInt();

            BookModel book;
            book = new BookModel(
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

            System.out.println("\nDesea ingresar otro Libro (S/N): ");
            sw = scan.next().toUpperCase().charAt(0);

        } while (sw == 'S');

    }

    public static void updateBook() throws IllegalAccessException {

        System.out.println("""
                           Por favor para actualizar: 
                           
                            debes de ingresar de nuevos los datos""");

        System.out.println("Ingrese el id: ");
        String id = scan.nextLine();

        System.out.println("\nIngrese el Titulo de libro: ");
        String title = scan.nextLine();

        System.out.println("Ingrese el Nombre del autor: ");
        String author = scan.nextLine();

        System.out.println("Ingrese el Año de publicacion: ");
        String publishedYear = scan.nextLine();

        System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
        String isAvailable = scan.nextLine();
        var availableArticle = "S".equals(isAvailable.toUpperCase()) ? true : false;

        System.out.println("Ingrese la Casa editorial: ");
        String editorial = scan.nextLine();

        System.out.println("Ingrese el Numero de paginas: ");
        Integer nPages = scan.nextInt();

        System.out.println("Ingrese el Numero de copias: ");
        Integer copies = scan.nextInt();

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
            System.out.println("No se ha encontrado un libro con el id: \n"
                    + " id: " + obj.getContent().getId() + "\n"
            );
        }

    }

    public static void listBook() {

        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID del libro que desea listar: ");
            String id = scan.nextLine();

            if (controller.getArticle(id) != null) {
                LinkedHashMap<String, Object> book = (LinkedHashMap<String, Object>) controller.getArticle(id);

                book.forEach((k, v) -> System.out.println("\n" + k + ": " + v + "\n"
                        + "________________"));

            }

            System.out.println("Desea Consultar un libro más? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');

    }

    public static void listBooks() {
        char sw;

        do {
          
            if (controller.getArticles() != null) {
                ArrayList<LinkedHashMap<String, Object>> books = controller.getArticles();

                for (LinkedHashMap<String, Object> book : books){
                    book.forEach((k, v) -> System.out.println("" + k + ": " + v + "\n"
                        + "________________"));
                    System.out.println("======================================");
                }

            }

            System.out.println("Quieres consultar los libros otra vez? S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');
    }

    public static void removeBook() {
        
        char sw;

        do {
            scan.nextLine();
            System.out.println("Por favor, ingrese el ID del libro que desea eliminar: ");
            String id = scan.nextLine();

            if (controller.removedArticle(id)) {
                System.out.println("\nEl libro con el ID: " + id + " Ha sido eliminado");
            } else {
                System.out.println("\nEl libro con el ID: " + id + " no ha sido eliminado");
                System.out.println("\nPor favor verifiqué el ID");
            }

            System.out.println("Desea Eliminar un libro más S/N");
            sw = scan.next().toUpperCase().charAt(0);
        } while (sw == 'S');

        
    }

}
