package Model;

public class BookModel {
    private int nPages; // Número de páginas del libro

    public BookModel( int nPages) {
        this.nPages = nPages;
    }

    public int getNPages() {
        return nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }
}
