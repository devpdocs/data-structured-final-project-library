package com.mycompany.library;
import view.BookView;
import view.MagazineView;
import view.VideoMediaView;
import java.util.Scanner;

public class Library {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IllegalAccessException {
        boolean continuar = true;

        do {
            System.out.println("\n**********BIENVENIDO AL MENU**********");
            System.out.println("LA LIBRERIA XYZ OFRECE LOS SIGUIENTES SERVICIOS");
            System.out.println("Seleccione el tipo de material que desea consultar:");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("3. VideoMedia");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número correspondiente a su opción: ");

            int opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ha seleccionado consultar libros (Book).");
                    BookQuery();
                }

                case 2 -> {
                    System.out.println("Ha seleccionado consultar revistas (Magazine).");
                    MagazineQuery();
                }

                case 3 -> {
                    System.out.println("Ha seleccionado consultar medios audiovisuales (VideoMedia).");
                    VideoMediaQuery();
                }

                case 4 -> {
                    System.out.println("Gracias por utilizar el sistema. Saliendo...");
                    continuar = false;
                }

                default -> System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
            }
        } while (continuar);

        scan.close();
    }

    public static void BookQuery() throws IllegalAccessException {
        boolean continuar = true;

        do {
            System.out.println("\nSeleccione una opción para consultar libros:");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Actualizar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Consultar un libro");
            System.out.println("5. Consultar todos los libros");
            System.out.println("6. Volver al menú principal");
            System.out.print("Ingrese el número correspondiente a su opción: ");

            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccione esta opción para ingresar libros.");
                    BookView.insertBook();
                }

                case 2 -> {
                    System.out.println("Seleccione esta opción para actualizar libros.");
                    BookView.updateBook();
                }

                case 3 -> {
                    System.out.println("Seleccione esta opción para eliminar libros.");
                    BookView.removeBook();
                }

                case 4 -> {
                    System.out.println("Seleccione esta opción para consultar un libro.");
                    BookView.listBook();
                }
                
                case 5 -> {
                    System.out.println("Seleccione esta opción para consultar todos los libros.");
                    BookView.listBooks();
                }

                case 6 -> continuar = false;

                default -> System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
            }
        } while (continuar);
    }

    public static void MagazineQuery() {
        boolean continuar = true;

        do {
            System.out.println("\nSeleccione una opción para consultar revistas:");
            System.out.println("1. Ingresar revista");
            System.out.println("2. Actualizar revista");
            System.out.println("3. Eliminar revista");
            System.out.println("4. Consultar revista");
            System.out.println("5 Consultar todas las revistas");
            System.out.println("6. Volver al menú principal");
            System.out.print("Ingrese el número correspondiente a su opción: ");

            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccione esta opción para ingresar revistas.");
                    MagazineView.insertMagazine();
                }

                case 2 -> {
                    System.out.println("Seleccione esta opción para actualizar revistas.");
                    MagazineView.updateMagazine();
                }

                case 3 -> {
                    System.out.println("Seleccione esta opción para eliminar revistas.");
                    MagazineView.removeMagazine();
                }

                case 4 -> {
                    System.out.println("Seleccione esta opción para consultar revistas.");
                    MagazineView.listMagazine();
                }
                
                case 5 -> {
                    System.out.println("Seleccione esta opción para consultar todas las revistas.");
                    MagazineView.listMagazines();
                }

                case 6 -> continuar = false;

                default -> System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
            }
        } while (continuar);
    }

    public static void VideoMediaQuery() {
        boolean continuar = true;

        do {
            System.out.println("\nSeleccione una opción para consultar medios audiovisuales:");
            System.out.println("1. Ingresar video");
            System.out.println("2. Actualizar video");
            System.out.println("3. Eliminar video");
            System.out.println("4. Consultar video");
            System.out.println("5. Consultar todos los videos");
            System.out.println("6. Volver al menú principal");
            System.out.print("Ingrese el número correspondiente a su opción: ");

            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccione esta opción para ingresar video.");
                    VideoMediaView.insertVideoMedia();
                }

                case 2 -> {
                    System.out.println("Seleccione esta opción para actualizar video.");
                    VideoMediaView.updateVideoMedia();
                }

                case 3 -> {
                    System.out.println("Seleccione esta opción para eliminar video.");
                    VideoMediaView.removeVideoMedia();
                }

                case 4 -> {
                    System.out.println("Seleccione esta opción para consultar video.");
                    VideoMediaView.listVideoMedia();
                }
                
                case 5 -> {
                    System.out.println("Seleccione esta opción para consultar todos los videos.");
                    VideoMediaView.listVideoMedias();
                }

                case 6 -> continuar = false;

                default -> System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
            }
        } while (continuar);
    }
}
