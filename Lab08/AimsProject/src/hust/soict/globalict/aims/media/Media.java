package hust.soict.globalict.aims.media;

public abstract class Media {
	private String idMedia;
    private String title;
    private String category;
    private float cost;

    public Media() {

    }
    public Media(String title){
        this.title=title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
     public Media(String title, String category, float cost, String id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.idMedia= id;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    public Media(String title, float cost, String id) {
        this.title = title;
        this.cost = cost;
        this.idMedia = id;
    }
    
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    public  String getIdMedia(){
        return idMedia;
    }
    public boolean equals(Media med){
        String temp= med.getIdMedia().toLowerCase();
        return this.idMedia.toLowerCase().equals(temp);
    }
    public int compareTo(Media o) {
        return this.getTitle().compareTo(o.getTitle());
    }

}
