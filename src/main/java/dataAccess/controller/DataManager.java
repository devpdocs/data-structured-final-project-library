/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.controller;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import dataAccess.interfaces.IInventoryAccessController;
import dataAccess.utils.GetResourcesFilePath;
import dataAccess.utils.Mapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author moies
 */
public class DataManager implements IInventoryAccessController {

    @Override
    public File readFromLocalDB(String file) throws URISyntaxException {
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource(file);
        if (resource == null) {
            throw new IllegalArgumentException("File hasn't found " + file);
        } else {
            return new File(resource.toURI());
        }
    }

    @Override
    public <T> void writeFromLocalDB(String path, T obj) throws URISyntaxException {
       String absoultePath = GetResourcesFilePath.get(path);
        try {
            
            Mapper.mapper.writeValue(new File(absoultePath), obj);

            
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
