package hust.soict.hedspi.aism.media.book;

import java.util.ArrayList;

import hust.soict.hedspi.aism.media.Media;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public void setAuthor(ArrayList<String> author) {
		this.authors = author;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)){
            System.out.println("Already exist");
        }
        else authors.add(authorName);
    }
	
	public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
        } else System.out.println("Does not exist");
    }
	
	public Book(String title){
        super.title = title;
    }

    public Book(String title,String category){
        super.title = title;
        super.category = category;
    }

    
    public Book(String title, String category, float cost) {
        super.title = title;
        super.category = category;
        super.cost = cost;
    }

    public Book(int id,String title,String category,float cost){
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
    }

    public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.authors = authors;
    }
	
	@Override
	public String displayInfor() {
		return "Book. ID: " + getId() +  "- Title: " + getTitle() + ", Category: " 
				+ getCategory() + ", Cost: " + getCost() + ", Authors: " + getAuthors();
	}
}
