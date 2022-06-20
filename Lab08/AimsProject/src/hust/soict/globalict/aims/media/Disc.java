package  hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.Media;

public class Disc extends Media{
     private int length;
    private String director;

    public int getLength() {
        return length;
    }
    
    public String getDirector() {
        return director;
    }
    public Disc() {
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category) {
        super(title, category);
    }

    public Disc(String title, float cost) {
        super(title, cost);
    }
    public Disc(String title, float cost, String id) {
        super(title, cost, id);
    }

    public Disc(int length, String director, String title, String category, float cost) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
     public Disc(int length, String director, String title, String category, float cost, String id) {
        super(title, category, cost,id);
        this.length = length;
        this.director = director;
    }
    
}
