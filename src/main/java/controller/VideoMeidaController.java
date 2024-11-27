/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.interfaces.IInventoryController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import dataAccess.controller.VideoMediaAccessController;
import model.VideoMediaModel;
import query.Query;

/**
 *
 * @author moies
 */
public class VideoMeidaController implements IInventoryController {
    private final VideoMediaAccessController access = new VideoMediaAccessController();
    private final ArrayList<VideoMediaModel> query;
    private final ArrayList<LinkedHashMap<String, Object>> _query;

    public VideoMeidaController() {
        this.query = Query.<VideoMediaModel>get("video-media.json");
        this._query = Query.<LinkedHashMap<String, Object>>get("video-media.json");
      
    }

    @Override
    public <T> boolean insertArticle(T article) throws IllegalAccessException {
        
        try {
            if (article == null) {
                return false;
            } else {
            
                VideoMediaModel videoMediaArticle = (VideoMediaModel) article;
                UUID uuid= UUID.randomUUID();
      
                
                videoMediaArticle.setId(uuid.toString());
                videoMediaArticle.setCreateAt(LocalDate.now().toString());
                videoMediaArticle.setUpdatedAt(LocalDate.now().toString());
                
                query.add(videoMediaArticle);
                access.accessData(query);
                

            }
        } catch (IllegalAccessException err) {
            return false;

        }
        return true;
    }

    @Override
    public <T> boolean updatedArticle(T article) throws IllegalAccessException {
        VideoMediaModel videoMedia = (VideoMediaModel) article;
        
        if (videoMedia == null){
            return false;
        }
            
        
        
        for (LinkedHashMap<String, Object> entity : _query) {

            if(entity.firstEntry().getValue().equals(videoMedia.getId())){
                
                entity.replace("title", videoMedia.getTitle());
                entity.replace("author", videoMedia.getAuthor());
                entity.replace("editorial", videoMedia.getEditorial());
                entity.replace("publishedYear", videoMedia.getPublishedYear());
                entity.replace("availableArticle", videoMedia.isAvailableArticle());
                entity.replace("hours", videoMedia.gethours());
                entity.replace("ncopy", videoMedia.getNcopy());
                entity.replace("updatedAt", LocalDate.now().toString());
                
                System.out.println(_query);
                System.out.println(_query);
                
                access.accessData(_query);
                
                return true;
                
            }
                    
        }
        
        
        
        return false;
        
    }

    @Override
    public <T> T getArticle(String id) throws NoSuchElementException {
        if (id == null){
            return null;
        }
        
        
        for (LinkedHashMap<String, Object> entity : _query) {

            if(entity.firstEntry().getValue().equals(id)){
                return (T) entity;
            }
                    
        }
        
        return null;
        
       
    }

    @Override
    public <T> ArrayList<T> getArticles() {
       
        return (ArrayList<T>) _query;
    }

    @Override
    public <T> boolean removedArticle(String id) throws NoSuchElementException {
        for (int index = 0; index < _query.size(); index++) {

            if(_query.get(index).firstEntry().getValue().equals(id)){
                
               
                query.remove(index);
                
                try {
                    access.accessData(query);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return true;
                
            }
                    
        }
        return false;
        
    }
    
}
