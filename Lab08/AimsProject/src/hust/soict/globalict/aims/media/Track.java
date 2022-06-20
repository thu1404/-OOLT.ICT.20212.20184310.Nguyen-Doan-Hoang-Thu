package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.Track;

public class Track implements Playable,Comparable<Object> {
	
	private int length;
    private String title;

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public Track(int length, String title) {
        this.length = length;
        this.title = title;
    }

    public Track() {

    }

    public boolean equals(Track track) {
        int d = 0;
        if (this.length == track.getLength()) {
            d++;
        }
        if (this.title.toLowerCase().equals(track.getTitle().toLowerCase())) {
            d++;
        }
        if (d == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Track){
            Track temp = (Track) o;
            return this.getTitle().compareTo(temp.getTitle());
        }
        return 0;
    }
}