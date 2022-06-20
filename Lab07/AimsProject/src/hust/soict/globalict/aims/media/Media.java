package hust.soict.globalict.aims.media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;

    public Media(String title){
        this.title=title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    } 
}
