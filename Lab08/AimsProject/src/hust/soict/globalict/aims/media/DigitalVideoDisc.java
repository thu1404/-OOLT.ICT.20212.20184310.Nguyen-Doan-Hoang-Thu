package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class DigitalVideoDisc extends Media implements Playable, Comparable<Object> {
		private String director;
		private int length;
		public DigitalVideoDisc() {
	        super();
	    }

	    public DigitalVideoDisc(String title) {
	        super(title);
	    }

	    public DigitalVideoDisc(String title, String category, float cost) {
	        super(title, category, cost);
	    }

	    public DigitalVideoDisc(String title, String category) {
	        super(title, category);
	    }

	   public DigitalVideoDisc(int length, String director, String title, String category, float cost) {
	        super(title, category, cost);
	        this.length=length;
	    }
	   public DigitalVideoDisc(int length, String director, String title, String category, float cost, String id) {
	        super(title, category, cost,id);
	        this.length=length;
	        this.director=director;
	    }
	   
	   public String getDirector() {
			return director;
		}

		public int getLength() {
			return length;
		}
	   // =================== search dvd ================
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
	    public void showDVD(){
	        System.out.println("DVD-"+this.getIdMedia()+"-"+ this.getTitle() + "-" + this.getLength() + "mins-" + this.getDirector()+"-" + this.getCost() + "-" + this.getCategory());
	    }

	    @Override
	    public void play() {
	        System.out.println("Playing DVD: " + this.getTitle());
	        System.out.println("DVD length: " + this.getLength());
	    }
	    
	    @Override
	    public int compareTo(Object obj) {
	        if (obj instanceof DigitalVideoDisc) {
	            DigitalVideoDisc aDigitalVideoDisc = (DigitalVideoDisc) obj;
	            return Float.compare(this.getLength(), aDigitalVideoDisc.getLength());
	        }
	        return 0;
	    }

}
