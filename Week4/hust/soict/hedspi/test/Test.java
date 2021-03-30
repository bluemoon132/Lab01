package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.utils.MyDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate("twenty first", "September", "twenty twenty");
//		date1.print();
		MyDate date2 = new MyDate(13,2,2021);
		System.out.println(date1.getStringDate());
		System.out.println(date2.getStringDate());
		date1.printWithFormat("yyyy-MM-dd");
		date1.printWithFormat("d/M/yyyy");
		date1.printWithFormat("dd-MMM-yyyy");
		date1.printWithFormat("MMM d yyyy");
		date1.printWithFormat("mm-dd-yyyy");
		date1.printWithFormat("mm-dd-yyyyaa");
	}

}
