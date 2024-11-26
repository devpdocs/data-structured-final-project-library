/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataAccess.interfaces;

import java.io.File;
import java.net.URISyntaxException;

/**
 *
 * @author moies
 */
public interface IInventoryAccessController {

    /**
     *
     * @param file
     * @return
     * @throws java.net.URISyntaxException
     */
    public File readFromLocalDB(String file) throws URISyntaxException;   
    public  <T>  void  writeFromLocalDB(String path, T obj) throws URISyntaxException;
}
