package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.Track;

public class Track implements Playable{
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

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }


}
