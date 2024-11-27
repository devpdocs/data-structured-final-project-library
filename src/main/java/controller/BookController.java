/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.interfaces.IInventoryController;
import dataAccess.controller.BookAccessController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import model.BookModel;
import query.Query;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

enum Keys {
    id,
    title,
    author
}

/**
 *
 * @author moies
 */
public class BookController implements IInventoryController {
    private final BookAccessController access = new BookAccessController();
    private final ArrayList<BookModel> query;
    private final ArrayList<LinkedHashMap<String, Object>> _query;

    public BookController() {
        this.query = Query.<BookModel>get("books.json");
        this._query = Query.<LinkedHashMap<String, Object>>get("books.json");
      
    }

    @Override
    public <T> boolean insertArticle(T article) throws IllegalAccessException {
        
        try {
            if (article == null) {
                return false;
            } else {
            
                BookModel bookArticle = (BookModel) article;
                UUID uuid= UUID.randomUUID();
      
                
                bookArticle.setId(uuid.toString());
                bookArticle.setCreateAt(LocalDate.now().toString());
                bookArticle.setUpdatedAt(LocalDate.now().toString());
                
                query.add(bookArticle);
                access.accessData(query);
                

            }
        } catch (IllegalAccessException err) {
            return false;

        }
        return true;
    }

    @Override
    public <T> boolean updatedArticle(T article) throws IllegalAccessException {
        BookModel book = (BookModel) article;
        
        if (book == null){
            return false;
        }
            
        
        
        for (LinkedHashMap<String, Object> entity : _query) {

            if(entity.firstEntry().getValue().equals(book.getId())){
                
                entity.replace("title", book.getTitle());
                entity.replace("author", book.getAuthor());
                entity.replace("editorial", book.getEditorial());
                entity.replace("publishedYear", book.getPublishedYear());
                entity.replace("availableArticle", book.isAvailableArticle());
                entity.replace("nPages", book.getNPages());
                entity.replace("ncopy", book.getNcopy());
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
