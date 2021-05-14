package hust.soict.hedspi.aism.media.dvd;

import hust.soict.hedspi.aims.PlayerException;
import hust.soict.hedspi.aism.media.Playable;
import hust.soict.hedspi.aism.media.disc.Disc;

public class DigitalVideoDisc extends Disc implements Playable{	
	public DigitalVideoDisc(String director, int length) {
        super(director, length);
    }
	
    public DigitalVideoDisc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost, director);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, director, length);
    }  
	
	@Override
	public void play() throws PlayerException {
	    if(this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
	        throw new PlayerException("ERROR: DVD length is non-positive!");
        }
	}
	
	@Override
	public String displayInfor() {
        return "DVD.ID: " + getId() + "- Title: " + getTitle() + ", Category: " + getCategory() 
        	+ ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }
}
