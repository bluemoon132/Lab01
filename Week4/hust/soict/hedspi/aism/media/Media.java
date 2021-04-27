package hust.soict.hedspi.aism.media;

public abstract class Media {
	protected String title;
	protected String category;
	protected int id;
	protected float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public int getId() {
		return id;
	}
	public float getCost() {
		return cost;
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
	
	public abstract String displayInfor();
}
