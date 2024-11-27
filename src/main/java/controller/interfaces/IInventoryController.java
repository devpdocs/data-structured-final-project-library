/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.interfaces;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 *
 * @author moies
 */
public interface IInventoryController {

    ArrayList articles = new ArrayList();

    public <T> ArrayList<T> insertArticle(T article, char sw) throws IllegalAccessException;

    public <T> T updatedArticle(T article, int id) throws IllegalAccessException;

    public <T> T getArticle(int id) throws NoSuchElementException;

    public <T> ArrayList<T> getArticles();
    
    public <T> T removedArticle (int id) throws NoSuchElementException;

}
