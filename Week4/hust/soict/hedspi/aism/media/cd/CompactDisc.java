package hust.soict.hedspi.aism.media.cd;

import java.util.ArrayList;

import hust.soict.hedspi.aism.media.Playable;
import hust.soict.hedspi.aism.media.disc.Disc;
import hust.soict.hedspi.aism.media.disc.Track;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public int getLength(ArrayList<Track> tracks) {
		int totalLength = 0;
		for(Track track: tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	
	public void addTrack(Track new_track) {
		if(tracks.contains(new_track)) {
			System.out.println("This track has been added!");
		}
		else {
			tracks.add(new_track);
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}
		else {
			System.out.println("This track hasn't been added!");
		}
	}
	

	public CompactDisc(String director, int length, String artist) {
        super(director, length);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(id, title, category, cost, director);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist,ArrayList<Track> tracks) {
        super(id, title, category, cost, director);
        this.artist = artist;
        this.tracks = tracks;
    }
	
	@Override
	public void play() {
		int i = 0;
		for(Track track: tracks) {
			i++;
			System.out.println(i + track.getTitle() + "Length: " + track.getLength());
		}
	}
	@Override
    public String displayInfor() {
        return "CD.ID: " + getId() + "- Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost() + ", Artist: " + getArtist();
    }
	
}
