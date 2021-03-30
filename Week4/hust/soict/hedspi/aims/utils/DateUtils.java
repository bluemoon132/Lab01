package hust.soict.hedspi.aims.utils;
public class DateUtils {
	public static void dateCompare(MyDate d1, MyDate d2){ 
		String date1 = d1.getStringDate();
		String date2 = d2.getStringDate();
		if (date1.compareTo(date2) > 0) 
			System.out.println(date1 + " is later than " + date2);
		else if (date1.compareTo(date2) == 0)
			System.out.println(date1 + " is equals to " + date2);
		else 
			System.out.println(date1 + " is earlier than " + date2);
	}
	
	public static void dateSort(MyDate [] dateArray){
		for(int i = 0; i < dateArray.length; i++) {
			for(int j = i; j < dateArray.length; j++) {
				if((dateArray[i].getStringDate()).compareTo(dateArray[j].getStringDate()) > 0) {
					swapDate(dateArray[i],dateArray[j]);
				}
			}
		}
	}
	
	public static void swapDate(MyDate date1, MyDate date2) {
		int day = date1.getDay();
		int month = date1.getMonth();
		int year = date1.getYear();
		date1.setDay(date2.getDay());
		date1.setMonth(date2.getMonth());
		date1.setYear(date2.getYear());
		date2.setDay(day);
		date2.setMonth(month);
		date2.setYear(year);
	}
	
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1,1,2020);
		MyDate date2 = new MyDate(2,5,2020);
		MyDate date3 = new MyDate(5,2,2020);
		MyDate[] dateArray = {date1, date2, date3};
		System.out.println("Before sort");
		for(int i = 0; i < dateArray.length; i++) {
			System.out.println(dateArray[i].getStringDate());
		}
		System.out.println("After sort");
		dateSort(dateArray);
		for(int i = 0; i < dateArray.length; i++) {
			System.out.println(dateArray[i].getStringDate());
		}
	}
}
