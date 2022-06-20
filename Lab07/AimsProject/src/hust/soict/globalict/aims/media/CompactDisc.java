package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(String title) {
    	super(title);
    }
    
    public CompactDisc(String artist, String title, float cost) {
    	super(title, cost);
    	this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }else System.out.println("Track already existed!!");
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
        }else System.out.println("Track doesn't exist!!");
    }
    
    public int getLength(){
        int totalLength=0;
         for (int i = 0; i < tracks.size(); i++) {
             totalLength+= tracks.get(i).getLength();
         }
         return totalLength;
    }
    
    @Override
    public void play() {
        for (int i = 0; i < tracks.size(); i++) {
             tracks.get(i).play();
         }
    }
}

