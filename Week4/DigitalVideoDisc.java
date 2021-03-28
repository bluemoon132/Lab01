package hust.soict.hedspi.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.length = length;
		this.cost = cost;
	}
	public String toStringDVD() {
		String dvd = ". DVD - "+ title + " - "+ category+" - "+ length +": "+ cost + "$";
		return dvd;
	}
	public boolean search(String title) {
		String[] tokens = title.split(" ");
		String searchTitle = getTitle();
		for(String token: tokens) {
			if(!searchTitle.contains(token)) {
				return false;
			}
		}
		return true;
	}
}
