package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.Random;

public class Order {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERED = 10;
	private static int nbOrdered = 0;
	public static final int MAX_LIMITED_ORDERED = 5;	
	private String dateOrdered;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED+1];
	
	public static int getNbOrdered() {
		return nbOrdered;
	}
	public static void setNbOrdered(int nbOrdered) {
		Order.nbOrdered = nbOrdered;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
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
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = getQtyOrdered();
		if(i < MAX_NUMBER_ORDERED) {
			this.itemsOrdered[i+1] = disc;
			setQtyOrdered(i+1);
		}
		else {
			System.out.println("Max orders is: " + MAX_NUMBER_ORDERED);
			System.out.println("Please remove an order to add a new order!");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for(int i = 0; i < dvdList.length; i++) {
			this.addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int max = getQtyOrdered();
		for(int i = 1; i <= max; i++) {
			if(disc == itemsOrdered[i]) {
				for(int j = i ; j < max; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
			}
		}
		setQtyOrdered(max-1);
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 1; i < getQtyOrdered()+1; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void printOrder() {
		System.out.println("*********Order*********");
		System.out.println("Date: " + getDateOrdered());
		System.out.println("Ordered Items: ");
		for(int i = 1 ; i < getQtyOrdered()+1; i++) {
				String dvd =itemsOrdered[i].toStringDVD();
				System.out.println(i+dvd);
	
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
	
	public DigitalVideoDisc getALuckyItem() {
		Random generator = new Random();
		int value = generator.nextInt(qtyOrdered) + 1;
		return itemsOrdered[value];
	}
	
	
}
