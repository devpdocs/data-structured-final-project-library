/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.utils;

import dataAccess.controller.InventoryController;
import java.io.File;
import java.net.URISyntaxException;


/**
 *
 * @author moies
 */
public class FilePath {
    static InventoryController dataController = new InventoryController();
    
    public static File path (String file) throws URISyntaxException{
        File pathFile = dataController.readFromLocalDB(file);
        return pathFile; 
    }
}
