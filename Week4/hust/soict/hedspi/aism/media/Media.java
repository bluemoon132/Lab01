package hust.soict.hedspi.aism.media;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
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
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media() {
		super();
	}
	public Media(String title) {
		super();
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String displayInfor() {
		String media = title + " - "+ category +" : "+ cost + "$";
		return media;
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
