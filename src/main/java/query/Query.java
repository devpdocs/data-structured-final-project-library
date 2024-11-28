/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package query;
import com.fasterxml.jackson.core.type.TypeReference;
import dataAccess.utils.FileFromResources;
import dataAccess.utils.Mapper;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
/**
 *
 * @author moies
 */
public class Query {

    public static <T> ArrayList<T> get(String path) {
        ArrayList<T> getLsit = new ArrayList<>();
        try {
            File file = FileFromResources.path(path);

            try {
                return Mapper.mapper.readValue(file, new TypeReference<ArrayList<T>>() {
                });
                
            } catch (IOException err) {
                return getLsit;
            }
        } catch (URISyntaxException e) {
            return getLsit;
        }

    }

}
