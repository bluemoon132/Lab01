public class Aism {

	public static void main(String[] args) {
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Sience Fiction", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation",87 , 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
//		anOrder.removeDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());

	}

}