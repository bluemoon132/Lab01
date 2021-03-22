import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
public class DateUtils {
	public static void dateCompare(MyDate d1, MyDate d2) throws Exception{
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1.getStringDate());  
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2.getStringDate());  
		if (date1.compareTo(date2) > 0) 
			System.out.println(date1 + " is later than " + date2);
		else 
			System.out.println(date1 + " is earlier than " + date2);
	}
	
	public static void dateSort(MyDate...mydates) throws ParseException {
		SimpleDateFormat sobj = new SimpleDateFormat("dd/MM/yyyy");
		Date dates[] = new Date[mydates.length];
		for(int i = 0; i < mydates.length;i++) {
			dates[i]=sobj.parse(mydates[i].getStringDate());
		}
		Arrays.sort(dates);
		for(Date date1 : dates)                                  
        {                                                       
            System.out.println(sobj.format(date1));             
        }
	}
}
