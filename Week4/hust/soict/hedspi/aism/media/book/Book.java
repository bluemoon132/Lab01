package hust.soict.hedspi.aism.media.book;

import hust.soict.hedspi.aism.media.Media;

public class Book extends Media{
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		super();
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Book(String title, String category, String author,float cost) {
		super(title, category, cost);
		this.author = author;
	}
	public String displayInfor() {
		String book = author+" - "+title+" - "+category+" : "+cost+"$";
		return book;
	}
}
