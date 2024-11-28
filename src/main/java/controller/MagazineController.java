/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.interfaces.IInventoryController;
import dataAccess.controller.BookAccessController;
import dataAccess.controller.MagaZineAccessController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MagazineModel;
import query.Query;

/**
 *
 * @author moies
 */
public class MagazineController implements IInventoryController {
    private final MagaZineAccessController access = new MagaZineAccessController();
    private final ArrayList<MagazineModel> query;
    private final ArrayList<LinkedHashMap<String, Object>> _query;

    public MagazineController() {
        this.query = Query.<MagazineModel>get("magazine.json");
        this._query = Query.<LinkedHashMap<String, Object>>get("magazine.json");
      
    }

    @Override
    public <T> boolean insertArticle(T article) throws IllegalAccessException {
        
        try {
            if (article == null) {
                return false;
            } else {
            
                MagazineModel magazineArticle = (MagazineModel) article;
                UUID uuid= UUID.randomUUID();
      
                
                magazineArticle.setId(uuid.toString());
                magazineArticle.setCreateAt(LocalDate.now().toString());
                magazineArticle.setUpdatedAt(LocalDate.now().toString());
                
                query.add(magazineArticle);
                access.accessData(query);
                

            }
        } catch (IllegalAccessException err) {
            return false;

        }
        return true;
    }

    @Override
    public <T> boolean updatedArticle(T article) throws IllegalAccessException {
        MagazineModel magazine = (MagazineModel) article;
        
        if (magazine == null){
            return false;
        }
            
        
        
        for (LinkedHashMap<String, Object> entity : _query) {

            if(entity.firstEntry().getValue().equals(magazine.getId())){
                
                entity.replace("title", magazine.getTitle());
                entity.replace("author", magazine.getAuthor());
                entity.replace("editorial", magazine.getEditorial());
                entity.replace("publishedYear", magazine.getPublishedYear());
                entity.replace("availableArticle", magazine.isAvailableArticle());
                entity.replace("brand", magazine.getBrand());
                entity.replace("gender", magazine.getGender());
                entity.replace("ncopy", magazine.getNcopy());
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
