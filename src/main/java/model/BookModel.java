package model;

import interfaces.MaterialType;


public class BookModel extends InventoryModel {

    private int nPages; // Número de páginas del libro

    public BookModel(
            String  id,
            int nPages,
            String title,
            String author,
            String editorial,
            String publishedYear,
            MaterialType materialType,
            boolean availableArticle,
            String createdAt,
            String updatedAt,
            int ncopy
    ) {
        super(id, title, author, editorial, publishedYear, MaterialType.BOOK, availableArticle, createdAt, updatedAt, ncopy);
        this.nPages = nPages;

    }

    public Integer getNPages() {
        return nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }
}
