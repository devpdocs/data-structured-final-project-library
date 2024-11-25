/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.controller;

import dataAccess.interfaces.IInventoryController;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author moies
 */
public class InventoryAccessController implements IInventoryController{

    @Override
    public File readFromLocalDB(String file) throws URISyntaxException {
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource(file);
        if (resource == null){
            throw new IllegalArgumentException("File hasn't found " + file);
        } else {
            return new File(resource.toURI());
        }
    }

    @Override
    public void writeFromLocalDB() throws URISyntaxException {
        
    }
    
}
