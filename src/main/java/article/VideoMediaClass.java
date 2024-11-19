package article;

import inventory.InventoryClass;
import inventory.ArticleType;
import java.util.Date;

public class VideoMediaClass extends InventoryClass {
    private String duration; // Duración en formato "HH:mm"
    private String format; // Formato del video (DVD, Blu-ray, etc.)

    public VideoMediaClass(int id, String title, String editorial, Date publishedYear, String duration, String format) {
        super(id, title, ArticleType.VIDEO_MEDIA, editorial, publishedYear);
        this.duration = duration;
        this.format = format;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void updateArticle(InventoryClass article) {
        if (article instanceof VideoMediaClass) {
            VideoMediaClass video = (VideoMediaClass) article;
            this.title = video.title;
            this.editorial = video.editorial;
            this.publishedYear = video.publishedYear;
            this.duration = video.duration;
            this.format = video.format;
            this.updatedAt = new Date(); // Actualizar la fecha de modificación
        }
    }

    @Override
    public String toString() {
        return "VideoMediaClass{" +
                "duration='" + duration + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
