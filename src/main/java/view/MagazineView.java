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
public class MagazineView {
    
    
     private static MagazineView Magazine = new MagazineView();
    private static Scanner scan = new Scanner(System.in);
    
    public static void updateMagazine() {
        
          String title;
          String author;
          String materialType; 
          String publishedYear;
          boolean availableArticle;
          String editorial;
          int nPages;
          int id;
          String brand;
          String gender;
          int copies;
          
     do{      
          System.out.println("¿Desea actualizar el Titulo de la revista (S/N): ");
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
        
        System.out.println("¿Desea actualizar el genero? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Número de páginas: ");
            gender = scan.nextLine();
            scan.nextLine(); 
        }
        
        
        System.out.println("¿Desea actualizar marca de la revista? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Número de páginas: ");
            brand = scan.nextLine();
            scan.nextLine(); 
        }

        System.out.println("¿Desea actualizar la cantidad de copias? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo ID: ");
            copies = scan.nextInt();
            scan.nextLine(); 
        }
        
        
        System.out.println("¿Desea actualizar el ID de la revista? (S/N): ");
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
        System.out.println("Genero: " + gender);
        System.out.println("Marca: " + brand);
        System.out.println("Número de Copias: " + copies);
        System.out.println("ID: " + id);

        scan.close();
          
    } 
    
    public static void insertMagazine() {
        
        String title;
          String author;
          String materialType; 
          String publishedYear;
          boolean availableArticle;
          String editorial;
          int nPages;
          int id;
          String brand;
          String gender;
          int copies;
          
          System.out.println("Ingrese el Titulo de la revista: ");
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
            
            System.out.println("Ingrese el genero: ");
            gender = scan.nextLine();
            
            System.out.println("Ingrese la marca para la revista: ");
            brand = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias de la revista: ");
            copies = scan.nextInt();
            
            System.out.println("Ingrese el ID para la revista: ");
            id = scan.nextInt();
    } 
    
    public static void removeMagazine() {
        
        System.out.println("Por favor, ingrese el ID de la revista que desea borrar: ");
    int id = scan.nextInt();
    scan.nextLine();

    
    System.out.println("Ha ingresado el ID: " + id);
    System.out.println("¿Está seguro de que desea borrar esta revista? (S/N): ");
    String confirmacion = scan.nextLine().toUpperCase();

    
    if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("La revista con ID " + id + " ha sido eliminada.");
        
    } else {
        System.out.println("Operación cancelada. La revista no ha sido borrada.");
    }
    } 
    
    public static void listMagazine() {
        
        System.out.println("Por favor, ingrese el ID de La revista que desea listar: ");
        int id = scan.nextInt();
    scan.nextLine();

    
        System.out.println("Ha ingresado el ID: " + id);
        System.out.println("¿Está seguro de que desea listar esta revista? (S/N): ");
        String confirmacion = scan.nextLine().toUpperCase();

     
        if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("La revista con ID " + id + " ha sido listada.");
        
        } else {
        System.out.println("Operación cancelada.");
        }
        
    }
     
    
    public static void listMagazines() {
        
        
        
    }
    
}
