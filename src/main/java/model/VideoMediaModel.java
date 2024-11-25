package model;

public class VideoMediaModel  {
    private String hours; // Duración 

public VideoMediaModel(String hours){
    this.hours= hours;
}

    public String gethours() {
        return hours;
    }

    public void sethours(String duration) {
        this.hours = duration;
    }
}
