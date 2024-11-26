package model;

import interfaces.MaterialType;
import java.time.LocalDate;

public class BookModel extends InventoryModel {

    private int nPages; // Número de páginas del libro

    public BookModel(
            int nPages,
            int id,
            String title,
            String author,
            String editorial,
            String publishedYear,
            MaterialType materialType,
            boolean availableArticle,
            LocalDate createdAt,
            LocalDate updatedAt,
            int ncopy;
    ) {
        super(id, title, author, editorial, publishedYear, MaterialType.BOOK, availableArticle, createdAt, updatedAt, ncopy);
        this.nPages = nPages;
        

    }

    public int getNPages() {
        return nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }
}
