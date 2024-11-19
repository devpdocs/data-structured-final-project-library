package inventory;

import java.util.Date;

public abstract class InventoryClass {
    protected int id; // Identificador único
    protected String title; // Título del material
    protected ArticleType materialType; // Tipo de material (Libro, Revista, Video)
    protected String editorial; // Editorial
    protected Date publishedYear; // Año de publicación
    protected Date createdAt; // Fecha de creación
    protected Date updatedAt; // Fecha de última actualización
    protected boolean availableArticle; // Indica si está disponible para préstamo

    // Constructor
    public InventoryClass(int id, String title, ArticleType materialType, String editorial, Date publishedYear) {
        this.id = id;
        this.title = title;
        this.materialType = materialType;
        this.editorial = editorial;
        this.publishedYear = publishedYear;
        this.createdAt = new Date(); // Fecha actual
        this.updatedAt = new Date(); // Fecha actual
        this.availableArticle = true; // Por defecto, disponible
    }

    // Métodos abstractos
    public abstract void updateArticle(InventoryClass article);

    // Getters y setters
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

    public ArticleType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(ArticleType materialType) {
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

    @Override
    public String toString() {
        return "InventoryClass{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", materialType=" + materialType +
                ", editorial='" + editorial + '\'' +
                ", publishedYear=" + publishedYear +
                ", availableArticle=" + availableArticle +
                '}';
    }
}
