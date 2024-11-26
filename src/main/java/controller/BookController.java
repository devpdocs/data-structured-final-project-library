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
import java.util.Optional;
import model.BookModel;

/**
 *
 * @author moies
 */
public class BookController implements IInventoryController {

    private final ArrayList<BookModel> bookArticleList = new ArrayList<>();
    private final BookAccessController access = new BookAccessController();

    @Override
    public <T> ArrayList<T> insertArticle(T article, char sw) throws IllegalAccessException {
        try {
            if (article == null) {
                return null;
            } else {
                // Narrowing Casting object
                BookModel bookArticle = (BookModel) article;
                // book id
                int id = bookArticleList.size(); 
                bookArticle.setId(id);
                bookArticle.setCreateAt(LocalDate.now().toString());
                bookArticle.setUpdatedAt(LocalDate.now().toString());
                
                this.bookArticleList.add(bookArticle);

                if (sw == 'N') {
                    // TODO: when the 'sw' contains 'N',that's means than the data must be saved 
                    access.insertArticle(this.bookArticleList, 'N');
                    
                    return (ArrayList<T>) this.bookArticleList;

                }

            }
        } catch (IllegalAccessException err) {
            return null;

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
