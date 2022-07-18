package Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

	public static void main(String[] args) {
LocalDateTime object = LocalDateTime.now();
System.out.println("Local date and time before formatting :"+object);
DateTimeFormatter formatobject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
System.out.println("Local date and time after formatting : "+formatobject);
	}

}
