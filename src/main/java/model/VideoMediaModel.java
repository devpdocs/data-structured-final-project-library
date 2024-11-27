package model;

import interfaces.MaterialType;


public class VideoMediaModel extends InventoryModel {

    private String hours; // Duración 

    public VideoMediaModel(
            String hours, 
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
        super(id, title, author, editorial, publishedYear, MaterialType.VIDEO_MEDIA, availableArticle, createdAt, updatedAt, ncopy);
        this.hours = hours;
    }

    public String gethours() {
        return hours;
    }

    public void sethours(String duration) {
        this.hours = duration;
    }
}
