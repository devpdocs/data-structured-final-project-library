package model;

import interfaces.MaterialType;


public class MagazineModel extends InventoryModel {

    private String brand; // Tipo de revista
    private String gender; // Género de la revista

    public MagazineModel(
            String brand, 
            String gender, 
            int nPages,
            int id,
            String title,
            String author,
            String editorial,
            String publishedYear,
            MaterialType materialType,
            boolean availableArticle,
            String createdAt,
            String updatedAt,
            int ncopy) {
        super(id, title, author, editorial, publishedYear, MaterialType.MAGAZINE, availableArticle, createdAt, updatedAt, ncopy);
        this.brand = brand;
        this.gender = gender;
    }

    public String getBranch() {
        return brand;
    }

    public void setBranch(String branch) {
        this.brand = brand;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
