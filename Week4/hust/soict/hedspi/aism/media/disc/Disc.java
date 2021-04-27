package hust.soict.hedspi.aism.media.disc;

import hust.soict.hedspi.aism.media.Media;

public class Disc extends Media {
	protected int length;
	protected String director;
	
	public int getLength() {
		return length;
	}
	
	public String getDirector() {
		return director;
	}
	
	public Disc(String director, int length) {
        this.director = director;
        this.length = length;
    }   
    
    public Disc(int id,String title,String category,float cost,String director) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.director = director;
    }

    public Disc(int id,String title,String category,float cost,String director, int length) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.director = director;
        this.length = length;
    }
    
	@Override
	public String displayInfor() {
		return "Disc.ID: " + getId() + "- Title: " + getTitle() + ", Category: " + getCategory() 
		+ ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
	}

}
