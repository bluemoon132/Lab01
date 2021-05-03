package hust.soict.hedspi.aims;

import java.util.*;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aism.media.AbstractItemFactory;
import hust.soict.hedspi.aism.media.BookFactory;
import hust.soict.hedspi.aism.media.CDFactory;
import hust.soict.hedspi.aism.media.DVDFactory;
import hust.soict.hedspi.aism.media.Media;
import hust.soict.hedspi.aism.media.book.Book;
import hust.soict.hedspi.aism.media.dvd.DigitalVideoDisc;

public class Aism {
	static List<Media> listOfProducts = new ArrayList<Media>();

	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

	}

	static void showAdminMenu() {
		ArrayList<Media> items = listofitem();
		Order order = new Order();
		MyDate date = new MyDate(13, 4, 2020);
		date.printWithFormat("mm-dd-yyyy");
		int select;
		Scanner sc = new Scanner(System.in);
		System.out.println("Admin Menu: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new item");
		System.out.println("2. Delete item by id");
		System.out.println("3. Display the items list of items");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		do {
			System.out.println("Select choice: ");
			select = sc.nextInt();
			switch (select) {
			case 1: // create new items
				showCreationMenu(items, order, sc);
				break;
			case 2:
				System.out.print("Enter the Id you want to delete: ");
				int id = sc.nextInt();
				order.removeItembyid(items, id);
				break;
			case 3:
				order.show(items);
				break;
			case 0:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Enter incorrectly, re-enter");
				break;
			}
		} while (select != 0);

		sc.close();
	}

	static void showCreationMenu(ArrayList<Media> items, Order order, Scanner sca) {
		int choice = -1;
		System.out.println("Creation Menu: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create DVD product");
		System.out.println("2. Create CD product");
		System.out.println("3. Create Book product");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		do {
			System.out.println("Select choice: ");
			choice = sca.nextInt();
			switch (choice) {
			case 1:
                items.add(createItemFromConsole(new BookFactory()));
                break;
            case 2:
                items.add(createItemFromConsole(new CDFactory()));
                break;
            case 3:
                items.add(createItemFromConsole(new DVDFactory()));
                break;
			case 0:
				System.out.println("Return to admin menu");
				break;
			default:
				System.out.println("Enter incorrectly, re-enter");
				break;
			}
		} while (choice != 0);
	}

	public static Order createOrder() {
		if (Order.checkNumberOfOrder()) {
			System.out.println("Order has been created");
			return new Order();
		} else {
			System.out.println("Cannot create more order...");
			return null;
		}
	}

	public static ArrayList<Media> listofitem() {
		ArrayList<Media> items = new ArrayList<Media>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 11, 77.9f);
		Book bk1 = new Book(2, "Star Wars", "Science Fiction", 88.7f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(3, "The Dark Knight", "Action Movie", "Christopher Nolan", 33,
				99.4f);
		Book bk2 = new Book(4, "Terminator 2: Judgment Day", "Action Movie", 111.9f, bk1.getAuthors());
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(5, "Die Hard", "Action Movie", "John McTiernan", 55, 222.3f);
		Book bk3 = new Book(6, "Inception", "Action Movie", 33.2f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(7, "Conan", "Action Movie", "Christopher Nolan", 80, 40.7f);
		Book bk4 = new Book(8, "One Piece", "Action Movie", 70.8f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(9, "Harry Potter", "Action Movie", "Christopher Nolan", 76, 30.5f);
		Book bk5 = new Book(10, "Dragon", "Action Movie", 323.9f);
		bk1.addAuthor("R K Rowling");
		bk2.addAuthor("Hadersen");
		bk2.removeAuthor("R K Rowling");
		bk3.addAuthor("Hadersen");
		bk3.addAuthor("R K Rowling");
		bk4.addAuthor("Hadersen");
		bk4.addAuthor("R K Rowling");
		bk5.addAuthor("Hadersen");
		items.add(dvd1);
		items.add(bk1);
		items.add(dvd2);
		items.add(bk2);
		items.add(dvd3);
		items.add(bk3);
		items.add(dvd4);
		items.add(bk4);
		items.add(dvd5);
		items.add(bk5);
		return items;
	}

	public static Media createItemFromConsole(AbstractItemFactory factory) {
		return factory.createMediaItemFromConsole();
	}

	public static void main(String[] args) {
		showAdminMenu();
	}
}
