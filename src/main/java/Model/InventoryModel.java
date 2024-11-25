package Model;
import Interfaces.MaterialType;
import java.util.Date;

public abstract class InventoryModel {
    protected int id; // Identificador 
    protected String title; // Título del material
    protected MaterialType materialType; // Tipo de material 
    protected String editorial; // Editorial
    protected Date publishedYear; // Año de publicación
    protected Date createdAt; // Fecha de creación
    protected Date updatedAt; // Fecha de última actualización
    protected boolean availableArticle; // Indica si está disponible para préstamo
    protected int ncopy;//Numero de copias 

    public InventoryModel(int id, String title, String materialType, String editorial, Date publishedYear, Date createdAt, Date updatedAt, boolean availableArticle, int ncopy) {
        this.id = id;
        this.title = title;
        this.materialType = materialType;
        this.editorial = editorial;
        this.publishedYear = publishedYear;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.availableArticle = availableArticle;
        this.ncopy = ncopy;
    }

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

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Date publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isAvailableArticle() {
        return availableArticle;
    }

    public void setAvailableArticle(boolean availableArticle) {
        this.availableArticle = availableArticle;
    }

    public int getNcopy() {
        return ncopy;
    }

    public void setNcopy(int ncopy) {
        this.ncopy = ncopy;
    }
    

   
}
