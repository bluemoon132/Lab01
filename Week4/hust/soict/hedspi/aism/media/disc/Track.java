package hust.soict.hedspi.aism.media.disc;

import hust.soict.hedspi.aism.media.Playable;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
	
	@Override
	public void play() {
		if (this.getLength()<=0) {
			System.err.println("ERROR: Track length is 0");
		}
		System.out.println("Playing track: "+this.getTitle());
		System.out.println("Track length: "+this.getLength());
	}
}
