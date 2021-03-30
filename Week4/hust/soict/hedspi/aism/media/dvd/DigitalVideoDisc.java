package hust.soict.hedspi.aism.media.dvd;

import hust.soict.hedspi.aism.media.Media;

public class DigitalVideoDisc extends Media {
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, int length, float cost) {
		super(title, category, cost);
		this.length = length;
	}
	public String displayInfor() {
		String dvd = title+" - "+category+" - "+length+" : "+cost+"$";
		return dvd;
	}
}
