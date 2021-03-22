
public class Order {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = getQtyOrdered();
		if(i < MAX_NUMBER_ORDERED) {
			itemsOrdered[i+1] = disc;
			setQtyOrdered(i+1);
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
}
