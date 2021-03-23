package aism;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Order {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERED = 10;
	private String dateOrdered;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public String getDateOrdered() {
		return dateOrdered;
	}
	
	public void setDateOrdered() {
		Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        this.dateOrdered = formatter.format(date);
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = getQtyOrdered();
		if(i < MAX_NUMBER_ORDERED) {
			this.itemsOrdered[i+1] = disc;
			setQtyOrdered(i+1);
		}
		else {
			System.out.println("Full!");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int i = getQtyOrdered();
		if(i + dvdList.length < MAX_NUMBER_ORDERED) {
			for(int j = 0; j < dvdList.length ; j++) {
				this.itemsOrdered[i+1] = dvdList[j];
				i++;
			}
			setQtyOrdered(i+dvdList.length);
		}
		else {
			System.out.println("Full!");
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
				String title__ =itemsOrdered[i].getTitle();
				String category__ = itemsOrdered[i].getCategory();
				int length__ = itemsOrdered[i].getLength();
				float cost__ = itemsOrdered[i].getCost();
				System.out.println(i+". DVD - "+ title__ + " - "+ category__
						+" - "+ length__ +": "+ cost__ + "$");
	
		}
		System.out.println("Total cost: "+ totalCost());
		System.out.println("***********************");
	}
	public Order() {
		setDateOrdered();
	}
}
