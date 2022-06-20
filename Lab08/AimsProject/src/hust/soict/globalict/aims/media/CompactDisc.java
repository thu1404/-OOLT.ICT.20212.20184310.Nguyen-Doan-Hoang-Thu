package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Track;

public class CompactDisc extends Disc implements Playable,Comparable<Object> {
	private String artist;
    List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc() {
        
    }

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String artist, String title, float cost) {
        super(title, cost);
        this.artist = artist;
    }
    public CompactDisc(String artist, String title, float cost, String id) {
        super(title, cost,id);
        this.artist = artist;
    }

    public void addTrack(Track newTrack) {
        String tempTrack = newTrack.getTitle().toLowerCase();
        for (int i = 0; i < tracks.size(); i++) {
            String temp = tracks.get(i).getTitle().toLowerCase();
            if (temp.equals(tempTrack)) {
                System.out.println("This track is in the compact disc");
                return;
            }
        }
        tracks.add(newTrack);
    }
    public int getNumofTrack(){
        return tracks.size();
    }
    
    public void removeTrack(Track rmTrack){
        int d=0;
        String tempTrack = rmTrack.getTitle().toLowerCase();
        for (int i = 0; i < tracks.size(); i++) {
            String temp = tracks.get(i).getTitle().toLowerCase();
            if (temp.equals(tempTrack)) {
                System.out.println("The track has been removed");
                tracks.remove(i);
                d++;
            }
        }
        if(d==0) {
            System.out.println("The track is not in compact disc");
        }
        
    }
    public int getTotalLength(){
        int totalLength=0;
         for (int i = 0; i < tracks.size(); i++) {
             totalLength+= tracks.get(i).getLength();
         }
         return totalLength;
    }
    public void showAllTrack(){
         System.out.println("CDs of "+ this.getArtist()+ "- cost: "+ this.getCost());
        for (int i = 0; i < tracks.size(); i++) {
             System.out.println("\t"+(char)(i+97) +"."+tracks.get(i).getTitle()+ " --- "+ tracks.get(i).getLength());
         }
    }
    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof CompactDisc) {
            CompactDisc aCompactDisc = (CompactDisc) obj;
            if (this.tracks.size() == aCompactDisc.tracks.size()) {
                return Float.compare(this.getLength(), aCompactDisc.getLength());
            } else
                return Integer.compare(this.tracks.size(), aCompactDisc.tracks.size());
        }
        return 0;
    }
}
