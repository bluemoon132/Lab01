package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aism.media.Media;
import hust.soict.hedspi.aism.media.book.Book;
import hust.soict.hedspi.aism.media.dvd.DigitalVideoDisc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyDate date1 = new MyDate("twenty first", "September", "twenty twenty");
////		date1.print();
//		MyDate date2 = new MyDate(13,2,2021);
//		System.out.println(date1.getStringDate());
//		System.out.println(date2.getStringDate());
//		date1.printWithFormat("yyyy-MM-dd");
//		date1.printWithFormat("d/M/yyyy");
//		date1.printWithFormat("dd-MMM-yyyy");
//		date1.printWithFormat("MMM d yyyy");
//		date1.printWithFormat("mm-dd-yyyy");
//		date1.printWithFormat("mm-dd-yyyyaa");
		Book bk1 = new Book(2, "Star Wars", "Science Fiction", 88.7f);
		Book bk2 = new Book(2, "Terminator 2: Judgment Day", "Action Movie", 111.9f, bk1.getAuthors());
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(5, "Die Hard", "Action Movie", "John McTiernan", 55, 222.3f);
		Book bk3 = new Book(6, "Inception", "Action Movie", 33.2f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(7, "Conan", "Action Movie", "Christopher Nolan", 80, 40.7f);
		Book bk4 = new Book(8, "One Piece", "Action Movie", 70.8f);
		System.out.println(bk1.compareTo(bk2));
	}

}
