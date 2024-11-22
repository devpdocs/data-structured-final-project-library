package Model;

public class MagazineModel {
    private String branch; // Tipo de revista
    private String gender; // Género de la revista

    public MagazineModel(String branch, String gender) {
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
}

