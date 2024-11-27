/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MagazineController;
import dto.Generic;
import interfaces.MaterialType;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import model.MagazineModel;
/**
 *
 * @author arqua
 */
public class MagazineView {
    
    
     static MagazineController controller = new MagazineController();
     static Scanner scan = new Scanner(System.in);
    
    public static void updateMagazine() throws IllegalAccessException {
        
          char sw;
        
        
            System.out.println("\nIngrese el Id de la revista: ");
            scan.next();
            int id = scan.nextInt();
            
            System.out.println("\nIngrese el Titulo de la revista: ");
            scan.next();
            String title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            scan.next();
            String author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            scan.next();
            String  materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            scan.next();
            String  publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;
            
            System.out.println("Ingrese la Casa editorial: ");
            scan.next();
            String  editorial = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias de la revista: ");
            scan.next();
            int ncopy = scan.nextInt();
            
            System.out.println("Ingrese la marca para la revista: ");
            scan.next();
            String  brand = scan.nextLine();
            
            System.out.println("Ingrese el genero: ");
            scan.next();
            String gender = scan.nextLine();
            
            
            MagazineModel magazine = new MagazineModel(  
                    
                   gender,
                   brand,
                   0,
                   title, 
                   author, 
                   editorial, 
                   publishedYear, 
                   MaterialType.MAGAZINE, 
                   availableArticle, 
                    "",
                    "", 
                   ncopy
                    
            ); 
            Generic<MagazineModel> obj = new Generic<>();
            obj.setContent(magazine);
           
            System.out.println("\nDesea actualizar otra revista (S/N): ");
             sw = scan.next().toUpperCase().charAt(0);
            ArrayList<MagazineModel> insertArticle = controller.insertArticle(obj.getContent(), sw);     
    

        
        
//        System.out.println("Actualización completada:");
//        System.out.println("Título: " + title);
//        System.out.println("Autor: " + author);
//        System.out.println("Tipo de material: " + materialType);
//        System.out.println("Año de publicación: " + publishedYear);
//        System.out.println("Disponible: " + availableArticle);
//        System.out.println("Editorial: " + editorial);
//        System.out.println("Número de páginas: " + nPages);
//        System.out.println("Genero: " + gender);
//        System.out.println("Marca: " + brand);
//        System.out.println("Número de Copias: " + copies);
//        System.out.println("ID: " + id);

       
          
    } 
    
    public static void insertMagazine()throws IllegalAccessException {
        
        char sw;
        
        do {
            System.out.println("\nIngrese el Id de la revista: ");
            scan.next();
            int id = scan.nextInt();
            
            System.out.println("\nIngrese el Titulo de la revista: ");
            scan.next();
            String title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            scan.next();
            String author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            scan.next();
            String  materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            scan.next();
            String  publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible fuera de la biblioteca: S/N ");
            String isAvailable = scan.nextLine();
            var availableArticle = "S".equals(isAvailable) ? true : false;
            
            System.out.println("Ingrese la Casa editorial: ");
            scan.next();
            String  editorial = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias de la revista: ");
            scan.next();
            int ncopy = scan.nextInt();
            
            System.out.println("Ingrese la marca para la revista: ");
            scan.next();
            String  brand = scan.nextLine();
            
            System.out.println("Ingrese el genero: ");
            scan.next();
            String gender = scan.nextLine();
            
            
            MagazineModel magazine = new MagazineModel(  
                    
                   gender,
                   brand,
                   0,
                   title, 
                   author, 
                   editorial, 
                   publishedYear, 
                   MaterialType.MAGAZINE, 
                   availableArticle, 
                    "",
                    "", 
                   ncopy
                    
            ); 
            Generic<MagazineModel> obj = new Generic<>();
            obj.setContent(magazine);
           
            System.out.println("\nDesea ingresar otra revista (S/N): ");
             sw = scan.next().toUpperCase().charAt(0);
            ArrayList<MagazineModel> insertArticle = controller.insertArticle(obj.getContent(), sw);     
                    
          } while (sw == 'S');          
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
