/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.VideoMediaModel;

/**
 *
 * @author moies
 */
public class VideoMediaAccessController {
    private final DataManager dataManager = new DataManager();
    private final String path = "video-media.json";

    public <T> ArrayList<T> accessData(T articles) throws IllegalAccessException {

        ArrayList<VideoMediaModel> videos = (ArrayList<VideoMediaModel>) articles;
        try {
            this.dataManager.writeFromLocalDB(this.path, videos);
        } catch (URISyntaxException ex) {
            Logger.getLogger(BookAccessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
