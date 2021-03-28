package hust.soict.hedspi.aims.utils;
import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
//	 Day
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>=1 && day <=31) {
			this.day = day;
		}else {
			System.out.println("Invalid Day!");
		}
	}
	public void setDay(String day) {
		this.day = getDayNumber(day);
	}
// Month	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=1 && month <=12) {
			this.month = month;
		}else {
			System.out.println("Invalid Month!");
		}
	}
	public void setMonth(String month){
		this.month = getMonthNumber(month);
	}
//	Year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setYear(String year) {
		this.year = getYearNumber(year);
	}
//	My Date
	public MyDate() {
		super();
		Calendar calendar = Calendar.getInstance();  
		this.day = calendar.get(Calendar.DATE);
		this.month = calendar.get(Calendar.MONTH)+1;
		this.year = calendar.get(Calendar.YEAR);
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String day, String month, String year) {
		super();
		this.day = getDayNumber(day);
		this.month = getMonthNumber(month);
		this.year = getYearNumber(year);
	}

	public String toStringDate() {
		String date = "";
		if(day != 0 && month != 0 & year != 0) {
			date = ( getMonthString(month) + " " + day + getDayStringStt(day) + " " + year);
		}
		else {
			Calendar calendar = Calendar.getInstance();
			date = ( getMonthString(calendar.get(Calendar.MONTH)+1) + " " + calendar.get(Calendar.DATE) + 
								getDayStringStt(calendar.get(Calendar.DATE)) + " " + calendar.get(Calendar.YEAR));
		}
		return date;
	}


	public int getMonthNumber(String monthName) {
		int monthNum=0;
		switch(monthName) {
			case "January":
			case "Jan":
				monthNum = 1;
				break;
			case "February":
			case "Feb":
				monthNum = 2;
				break;
			case "March":
			case "Mar":
				monthNum = 3;
				break;
			case "April":
			case "Apr":
				monthNum = 4;
				break;
			case "May":
				monthNum = 5;
				break;
			case "June":
			case "Jun":
				monthNum = 6;
				break;
			case "July":
			case "Jul":
				monthNum = 7;
				break;
			case "August":
			case "Aug":
				monthNum = 8;
				break;
			case "September":
			case "Sep":
				monthNum = 9;
				break;
			case "October":
			case "Oct":
				monthNum = 10;
				break;
			case "November":
			case "Nov":
				monthNum = 11;
				break;
			case "December":
			case "Dec":
				monthNum = 12;
				break;
		}
		return monthNum;
	}
	public int getDayNumber(String strDay) {
		int dayNum = 0;
		strDay.toLowerCase();
		if(strDay.contains("first")) dayNum += 1;
		if(strDay.contains("second")) dayNum += 2;
		if(strDay.contains("third")) dayNum += 3;
		if(strDay.contains("fourth")) dayNum += 4;
		if(strDay.contains("fifth")) dayNum += 5;
		if(strDay.contains("sixth")) dayNum += 6;
		if(strDay.contains("seventh")) dayNum += 7;
		if(strDay.contains("eighth")) dayNum += 8;
		if(strDay.contains("ninth")) dayNum += 9;
		if(strDay.contains("tenth")) dayNum += 10;
		if(strDay.contains("twenty-")) dayNum += 20;
		if(strDay.contains("thirty-")) dayNum += 30;
		if(strDay.contains("twentieth")) dayNum += 20;
		if(strDay.contains("thirtieth")) dayNum += 30;
		return dayNum;
	}
	public int getYearNumber(String strYear) {
		int yearNum = 0;
		int tailNum = 0;
		int headNum = 0;
		String arr[] = strYear.split(" ", 2);
		switch(arr[0]) {
			case "eleven": headNum = 11; break;
			case "twelve": headNum = 12; break;
			case "thirteen": headNum = 13; break;
			case "fourteen": headNum = 14; break;
			case "fifteen": headNum = 15; break;
			case "sixteen": headNum = 16; break;
			case "seventeen": headNum = 17; break;
			case "eighteen": headNum = 18; break;
			case "nineteen": headNum = 19; break;
			case "twenty": headNum = 20; break;
		}
		String head = String.valueOf(headNum);
		switch(arr[1]) {
			case "one": tailNum += 1; break;
			case "two": tailNum += 2; break;
			case "three": tailNum += 3; break;
			case "four": tailNum += 4; break;
			case "five": tailNum += 5; break;
			case "six": tailNum += 6; break;
			case "seven": tailNum += 7; break;
			case "eight": tailNum += 8; break;
			case "nine": tailNum += 9; break;
			case "ten": tailNum = 10; break;
			case "eleven": tailNum = 11; break;
			case "twelve": tailNum = 12; break;
			case "thirteen": tailNum = 13; break;
			case "fourteen": tailNum = 14; break;
			case "fifteen": tailNum = 15; break;
			case "sixteen": tailNum = 16; break;
			case "seventeen": tailNum = 17; break;
			case "eighteen": tailNum = 18; break;
			case "nineteen": tailNum = 19; break;
			case "twenty": tailNum += 20; break;
			case "thirty": tailNum += 30; break;
			case "fourty": tailNum += 40; break;
			case "fifty": tailNum += 50; break;
			case "sixty": tailNum += 60; break;
			case "seventy": tailNum += 70; break;
			case "eighty": tailNum += 80; break;
			case "ninety": tailNum += 90; break;
		}
		String tail = String.valueOf(tailNum);
		head = head.concat(tail);
		yearNum = Integer.parseInt(head);
		return yearNum;
	}
	public String getMonthString(int monthNum) {
		String strMonth = "";
		switch(monthNum) {
			case 1: strMonth = "January"; break;
			case 2: strMonth = "February"; break;
			case 3: strMonth = "March"; break;
			case 4: strMonth = "April"; break;
			case 5: strMonth = "May"; break;
			case 6: strMonth = "June"; break;
			case 7: strMonth = "July"; break;
			case 8: strMonth = "August"; break;
			case 9: strMonth = "September"; break;
			case 10: strMonth = "October"; break;
			case 11: strMonth = "November"; break;
			case 12: strMonth = "December"; break;
		}
		return strMonth;
	}
	public String getDayStringStt(int dayNum) {
		String strDay = "";
		switch(dayNum) {
		case 1: case 21: case 31: strDay = "st"; break;
		case 2: case 22: strDay = "nd"; break;
		case 3: case 23: strDay = "rd"; break;
		default: strDay = "th";
		}
		return strDay;
	}
	public String getStringDate() {
		String dateStr;
		dateStr = String.valueOf(getYear())+"/"+String.valueOf(getMonth()) +"/"+ String.valueOf(getDay());
		return dateStr;
	}
	
	public void printWithFormat(String strFormat) {
		switch(strFormat) {
			case "yyyy-MM-dd":
				String date = String.valueOf(year) + "-";
				if(month<10) date = date + String.valueOf(0) + String.valueOf(month) + "-";
				else date = date + String.valueOf(month) + "-";
				if(day<10) date = date + String.valueOf(0) + String.valueOf(day);
				else date = date + String.valueOf(day);
				System.out.println("The date with format " + strFormat + "is: " + date);
				break;
			case "d/M/yyyy":
				String date2 = String.valueOf(day) + "-";
				date2 = date2 + String.valueOf(month) + "-";
				date2 = date2 + String.valueOf(year);
				System.out.println("The date with format " + strFormat + " is: " + date2);
				break;
			case "dd-MMM-yyyy":
				String date3 = "";
				if(day<10) date3 = date3 + String.valueOf(0) + String.valueOf(day) + "-";
				else date3 = date3 + String.valueOf(day) + "-";
				date3 = date3 + getMonthString(month)+"-";
				date3 = date3 + String.valueOf(year);
				System.out.println("The date with format " + strFormat + " is: " + date3);
				break;
			case "MMM d yyyy":
				String date4 = "";
				date4 = date4 + getMonthString(month) + " ";
				date4 = date4 + String.valueOf(day) + " ";
				date4 = date4 + String.valueOf(year);
				System.out.println("The date with format " + strFormat + " is: " + date4);
				break;
			case "mm-dd-yyyy":
				String date5 = "";
				if(month<10) date5 = date5 + String.valueOf(0) + String.valueOf(month) + "-";
				else date5 = date5 + String.valueOf(month) + "-";
				if(day<10) date5 = date5 + String.valueOf(0) + String.valueOf(day) + "-";
				else date5 = date5 + String.valueOf(day) + "-";
				date5 = date5 + String.valueOf(year);
				System.out.println("The date with format " + strFormat + " is: " + date5);
				break;
			default: 
				System.out.println("Invalid format!");
		}
		
	}
}
