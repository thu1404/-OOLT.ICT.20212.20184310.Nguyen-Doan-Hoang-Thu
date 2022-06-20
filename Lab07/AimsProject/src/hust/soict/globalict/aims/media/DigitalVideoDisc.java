package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    
	public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category) {
    	super(title, category);
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public DigitalVideoDisc(int length, String director, String title, String category, float cost) {
        super(length, director, title, category, cost);
    }
  
   // =================== search DVD ================
    public boolean search(String title) {
        title = title.toLowerCase();
        title = title.trim().replaceAll("\\s+", " ");
        String temp = this.getTitle().toLowerCase();
        if (temp.equals(title)) {
            return true;
        }
        String[] arrTitle = title.split(" ");
        int count = 0;
        for (String item : arrTitle) {
            if (temp.contains(item)) {
                count++;
            }
        }
        if (count == arrTitle.length) {
            return true;
        }
        return false;
    }
    // ==========================
    
     @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

