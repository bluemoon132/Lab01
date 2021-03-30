package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aism.media.Media;

import java.util.ArrayList;
import java.util.Random;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private static int nbOrdered = 0;
	public static final int MAX_LIMITED_ORDERED = 5;	
	private String dateOrdered;
	public ArrayList<Media> listOfItems = new ArrayList<Media>(MAX_NUMBER_ORDERED);
	
	public static int getNbOrdered() {
		return nbOrdered;
	}
	public static void setNbOrdered(int nbOrdered) {
		Order.nbOrdered = nbOrdered;
	}
	
	public void setDateOrdered(String dateOrder) {
		String[] words=dateOrder.split(" ");
		MyDate date1 = new MyDate(words[0], words[1], words[2]);
		this.dateOrdered = date1.getStringDate();
	}
	public String getDateOrdered() {
		return dateOrdered;
	}	
	public void setDateOrdered() {
		MyDate date1 = new MyDate();
		this.dateOrdered = date1.getStringDate();
	}
	public void addItem(Media item) {
		listOfItems.add(item);
	}
	public void addItems(ArrayList<Media> listItem) {
		listOfItems.addAll(listItem);
	}
	public void removeItem(Media item) {
		listOfItems.remove(item);
	}	
	public float totalCost() {
		float total = 0;
		for(Media Item: listOfItems) {
			total += Item.getCost();
		}
		return total;
	}
	
	public void printOrder() {
		System.out.println("*********Order*********");
		System.out.println("Date: " + getDateOrdered());
		System.out.println("Ordered Items: ");
		for(Media Item: listOfItems) {
				String media = Item.displayInfor();
				System.out.println(media);
		}
		System.out.println("Total cost: "+ totalCost());
		System.out.println("***********************");
	}
	
	public Order() {
		setDateOrdered();
		Order.setNbOrdered(getNbOrdered()+1);
	}
	
	public static Order checkOrderAndInit() {
		int i = getNbOrdered();
		if(i >= MAX_LIMITED_ORDERED) {
			System.out.println("Your number of orders has reached the limit!");
			return null;
		}
		else {
			Order order = new Order();
			return order;
		}
	}
	
	public Media getALuckyItem() {
		Random generator = new Random();
		int value = generator.nextInt(listOfItems.size()) + 1;
		listOfItems.get(value).setCost(0);
		return listOfItems.get(value);
	}
	
	
}
