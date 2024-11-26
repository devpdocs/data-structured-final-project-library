/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.utils;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author moies
 */
public class GetResourcesFilePath {

    public static String get(String path) {
        
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        
        String absolutePath = s + "/src/main/resources/" + path;
        return absolutePath;
    }

}
