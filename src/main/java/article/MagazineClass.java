package article;

import inventory.InventoryClass;
import inventory.ArticleType;
import java.util.Date;

public class MagazineClass extends InventoryClass {
    private String branch; // Rama o tipo de revista (ej. Ciencia ficción, Naturaleza)
    private String gender; // Género de la revista

    public MagazineClass(int id, String title, String editorial, Date publishedYear, String branch, String gender) {
        super(id, title, ArticleType.MAGAZINE, editorial, publishedYear);
        this.branch = branch;
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void updateArticle(InventoryClass article) {
        if (article instanceof MagazineClass) {
            MagazineClass magazine = (MagazineClass) article;
            this.title = magazine.title;
            this.editorial = magazine.editorial;
            this.publishedYear = magazine.publishedYear;
            this.branch = magazine.branch;
            this.gender = magazine.gender;
            this.updatedAt = new Date(); // Actualizar la fecha de modificación
        }
    }

    @Override
    public String toString() {
        return "MagazineClass{" +
                "branch='" + branch + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

