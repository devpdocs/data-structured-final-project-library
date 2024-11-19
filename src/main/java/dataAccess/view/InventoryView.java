/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.view;

import dataAccess.controller.InventoryController;
import java.io.File;
import java.net.URISyntaxException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataAccess.model.User;
import java.io.IOException;

/**
 *
 * @author moies
 */
public class InventoryView {

    static InventoryController dataController = new InventoryController();

    public static void main(String[] args) {
        try {
            File file = dataController.readFromLocalDB("data.json");

            ObjectMapper mapper = new ObjectMapper();
            

            try {
                User user = mapper.readValue(file, User.class);
                System.out.println(user.getName());
                System.out.println(user.getAge());
                System.out.println(user.getLastname());
            } catch (IOException err){
                err.printStackTrace();
            }

        } catch (URISyntaxException error) {

        }

    }

}
