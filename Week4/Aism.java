package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aism {

	public static void main(String[] args) {
			Order anOrder = Order.checkOrderAndInit();
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
					"Animation", 87, 19.95f);
			anOrder.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
					"Sience Fiction", 87, 24.95f);
			anOrder.addDigitalVideoDisc(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
					"Animation",87 , 18.99f);
			anOrder.addDigitalVideoDisc(dvd3);
			DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter 1",
					"Fantasy",87 , 20.4f);
			DigitalVideoDisc dvd5 = new DigitalVideoDisc("Harry Potter 2",
					"Fantasy",87 , 21.99f);
			DigitalVideoDisc dvd6 = new DigitalVideoDisc("Harry Potter 3",
					"Fantasy",87 , 23.99f);
			DigitalVideoDisc[] dvdList = {dvd4, dvd5, dvd6};
			anOrder.addDigitalVideoDisc(dvdList);
			anOrder.printOrder();
			Order anOrder1 = Order.checkOrderAndInit();
			if(anOrder1 != null) {
				anOrder1.addDigitalVideoDisc(dvdList);
				anOrder1.printOrder();
			}
//			if(dvd4.search("Potter Harry")){
//				System.out.println("True!");
//			}
			
	}
}
