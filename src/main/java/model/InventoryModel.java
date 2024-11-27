package model;

import interfaces.MaterialType;

abstract class InventoryModel {

    protected String id;
    protected String title;
    protected String author;
    protected String editorial;
    protected String publishedYear;
    protected MaterialType materialType;
    protected boolean availableArticle;
    protected String createAt;
    protected String updatedAt;
    protected int ncopy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getNcopy() {
        return ncopy;
    }

    public void setNcopy(int ncopy) {
        this.ncopy = ncopy;
    }

    public InventoryModel(String id, String title, String author, String editorial, String publishedYear, MaterialType materialType, boolean availableArticle, String createAt, String updatedAt, int ncopy) {
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
