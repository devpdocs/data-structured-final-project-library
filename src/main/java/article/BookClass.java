package article;

import inventory.InventoryClass;
import inventory.ArticleType;
import java.util.Date;

public class BookClass extends InventoryClass {
    private int nPages; // Número de páginas del libro

    public BookClass(int id, String title, String editorial, Date publishedYear, int nPages) {
        super(id, title, ArticleType.BOOK, editorial, publishedYear);
        this.nPages = nPages;
    }

    public int getNPages() {
        return nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }

    @Override
    public void updateArticle(InventoryClass article) {
        if (article instanceof BookClass) {
            BookClass book = (BookClass) article;
            this.title = book.title;
            this.editorial = book.editorial;
            this.publishedYear = book.publishedYear;
            this.nPages = book.nPages;
            this.updatedAt = new Date(); // Actualizar la fecha de modificación
        }
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", editorial='" + editorial + '\'' +
                ", publishedYear=" + publishedYear +
                ", nPages=" + nPages +
                '}';
    }
}
