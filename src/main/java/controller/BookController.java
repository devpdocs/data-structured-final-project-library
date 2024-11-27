/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.interfaces.IInventoryController;
import dataAccess.controller.BookAccessController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import model.BookModel;
import query.Query;
import java.util.UUID;

/**
 *
 * @author moies
 */
public class BookController implements IInventoryController {
    private final BookAccessController access = new BookAccessController();
    private final ArrayList<BookModel> query;

    public BookController() {
        this.query = Query.<BookModel>get("books.json");
    }

    @Override
    public <T> ArrayList<T> insertArticle(T article, char sw) throws IllegalAccessException {
        try {
            if (article == null) {
                return null;
            } else {
            
                BookModel bookArticle = (BookModel) article;
                UUID uuid= UUID.randomUUID();
      
                
                bookArticle.setId(uuid.toString());
                bookArticle.setCreateAt(LocalDate.now().toString());
                bookArticle.setUpdatedAt(LocalDate.now().toString());
                
                query.add(bookArticle);
                
                if (sw == 'N') {
                    access.accessData(query);
                    return (ArrayList<T>) query;

                }

            }
        } catch (IllegalAccessException err) {
            return null;

        }
        return null;
    }

    @Override
    public <T> T updatedArticle(T article) throws IllegalAccessException {
        BookModel book = (BookModel) article;
        
        
        try {
            ArrayList<BookModel> queryset = query;
            
            for (int index = 0; index < queryset.size(); index++){
                BookModel _book = queryset.get(index);
                
                if (book.getId() == null ? _book.getId() == null : book.getId().equals(_book.getId())){
                    queryset.remove(index);
                    
                    book.setCreateAt(_book.getCreateAt());
                    book.setUpdatedAt(LocalDate.now().toString());
                    
                    queryset.add(book);
                    
                } else {
                    return null;
                }
            }
            
            
            access.accessData(queryset);
            
        } catch (IllegalAccessException e){
            return null;
        }
        
        return null;
        
    }

    @Override
    public <T> T getArticle(int id) throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> ArrayList<T> getArticles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> T removedArticle(int id) throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
