
package com.mycompany.library;

import view.BookView;
import view.MagazineView;
import java.util.Scanner;

public class Library {
 static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws IllegalAccessException {
        BookView.insertBook();
        
        System.out.println("Seleccione el tipo de material que desea consultar:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. VideoMedia");
        System.out.print("Ingrese el número correspondiente a su opción: ");

        int opcion = scan.nextInt();
        scan.nextLine(); 

    
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado consultar libros (Book).");
                
                
                break;

            case 2:
                System.out.println("Ha seleccionado consultar revistas (Magazine).");
              
                break;

            case 3:
                System.out.println("Ha seleccionado consultar medios audiovisuales (VideoMedia).");
               
                break;

            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 3.");
                break;
        }

        scan.close(); // Cerrar el Scanner
        
    }
    
    public static void BookQuery (){
    
    
    
    }
    
    public static void MagazineQuery (){
    
    
    
    }
    
    public static void VideoMediaQuery (){
    
    
    
    }
    
   
}

