/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess.controller;
import controller.interfaces.IInventoryController;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookModel;

/**
 *
 * @author moies
 */
public class BookAccessController implements IInventoryController {
    private final DataManager dataManager = new DataManager();
    private final String path = "books.json";
    @Override
    public <T> ArrayList<T> insertArticle(T articles, char sw) throws IllegalAccessException {
        
        ArrayList<BookModel> books = (ArrayList<BookModel>) articles; 
        try {
            this.dataManager.writeFromLocalDB(this.path, books);
        } catch (URISyntaxException ex) {
            Logger.getLogger(BookAccessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public <T> T updatedArticle(T article, int id) throws IllegalAccessException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
