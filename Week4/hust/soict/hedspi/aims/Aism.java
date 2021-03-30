package hust.soict.hedspi.aims;

import java.util.ArrayList;

import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aism.media.book.Book;
import hust.soict.hedspi.aism.media.dvd.DigitalVideoDisc;

public class Aism {

	public static void main(String[] args) {
			Order anOrder = Order.checkOrderAndInit();
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
					"Animation", 87, 19.95f);
			anOrder.addItem(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
					"Sience Fiction", 87, 24.95f);
			anOrder.addItem(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
					"Animation",87 , 18.99f);
			anOrder.addItem(dvd3);
			
			Book book1 = new Book("Harry Potter", "Fantasy", "J.K Rrowling", 20);
			anOrder.addItem(book1);
			DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter 1",
					"Fantasy",87 , 20.4f);
			DigitalVideoDisc dvd5 = new DigitalVideoDisc("Harry Potter 2",
					"Fantasy",87 , 21.99f);
			DigitalVideoDisc dvd6 = new DigitalVideoDisc("Harry Potter 3",
					"Fantasy",87 , 23.99f);
			ArrayList<DigitalVideoDisc> dvdList = new ArrayList<DigitalVideoDisc>();
			dvdList.add(dvd4);
			dvdList.add(dvd5);
			dvdList.add(dvd6);
//			anOrder.addItems(dvdList);
			anOrder.printOrder();
			Order anOrder1 = Order.checkOrderAndInit();
			if(anOrder1 != null) {
//				anOrder1.addItems(dvdList);
				anOrder1.printOrder();
			}
//			if(dvd4.search("Potter Harry")){
//				System.out.println("True!");
//			}
			
	}
}
