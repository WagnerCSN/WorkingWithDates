package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		System.out.println("Date local: "+ d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Date end time local: " + d02);

	}

}
