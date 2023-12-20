package movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"); // 시리얼넘버
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");	//  OrderTime
	        String formattedDateTime1 = now.format(formatter1);
	        String formattedDateTime2 = now.format(formatter2);
	        
	        System.out.println(formattedDateTime1);
}
}
