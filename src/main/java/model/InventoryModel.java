package Model;
import Interfaces.MaterialType;
import java.time.LocalDate;

abstract class InventoryModel {
    protected int id;
    protected String title;
    protected String author;
    protected String editorial;
    protected String publishedYear;
    protected MaterialType materialType;
    protected boolean availableArticle;
    protected LocalDate createAt;
    protected LocalDate updatedAt;
    protected int ncopy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public boolean isAvailableArticle() {
        return availableArticle;
    }

    public void setAvailableArticle(boolean availableArticle) {
        this.availableArticle = availableArticle;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getNcopy() {
        return ncopy;
    }

    public void setNcopy(int ncopy) {
        this.ncopy = ncopy;
    }

    public InventoryModel(int id, String title, String author, String editorial, String publishedYear, MaterialType materialType, boolean availableArticle, LocalDate createAt, LocalDate updatedAt, int ncopy) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.publishedYear = publishedYear;
        this.materialType = materialType;
        this.availableArticle = availableArticle;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
        this.ncopy = ncopy;
    }

}
