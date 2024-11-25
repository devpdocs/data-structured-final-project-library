/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;
import java.util.Scanner;

/**
 *
 * @author arqua
 */
public class BookView {
   
    private static BookView book = new BookView();
    private static Scanner scan = new Scanner(System.in);
    
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
          
     do{
          System.out.println("¿Desea actualizar el Título del libro? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Título: ");
            title = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Autor? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Autor: ");
            author = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Tipo de material? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Tipo de material: ");
            materialType = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Año de publicación? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Año de publicación: ");
            publishedYear = scan.nextLine();
        }

        System.out.println("¿Desea actualizar la disponibilidad? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese si está disponible (true/false): ");
            availableArticle = scan.nextBoolean();
            scan.nextLine(); 
        }

        System.out.println("¿Desea actualizar la Editorial? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese la nueva Editorial: ");
            editorial = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Número de páginas? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Número de páginas: ");
            nPages = scan.nextInt();
            scan.nextLine(); 
        }
        
        System.out.println("¿Desea actualizar el Número de copias? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Número de páginas: ");
            copies = scan.nextInt();
            scan.nextLine(); 
        }

        System.out.println("¿Desea actualizar el ID del libro? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo ID: ");
            id = scan.nextInt();
            scan.nextLine(); 
        }
        
     }  while (scan.nextLine().equalsIgnoreCase("S"));

        
        System.out.println("Actualización completada:");
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Tipo de material: " + materialType);
        System.out.println("Año de publicación: " + publishedYear);
        System.out.println("Disponible: " + availableArticle);
        System.out.println("Editorial: " + editorial);
        System.out.println("Número de páginas: " + nPages);
        System.out.println("Número de copias: " +  copies);
        System.out.println("ID: " + id);

        scan.close();
    }
     
    
    public static void insertBook() {

          String title;
          String author;
          String materialType; 
          String publishedYear;
          boolean availableArticle;
          String editorial;
          int nPages;
          int id;
          int copies;
          
            System.out.println("Ingrese el Titulo de libro: ");
            title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible: S/N ");
            availableArticle = scan.nextBoolean();
            
            System.out.println("Ingrese la Casa editorial: ");
            editorial = scan.nextLine();
            
            System.out.println("Ingrese el Numero de paginas: ");
            nPages = scan.nextInt();
            
            System.out.println("Ingrese el Numero de copias: ");
            copies = scan.nextInt();
            
            System.out.println("Ingrese el ID para el libro: ");
            nPages = scan.nextInt();

            
        
    } 
    
    public static void removeBook() {
        
        int id;
        
    } 
    
    public static void listBook() {
        
        int id;
        
    } 
    
    public static void listBooks() {
        
         
        
        
    }    
    
    
    









}

