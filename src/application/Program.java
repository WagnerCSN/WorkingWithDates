package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		System.out.println("Date local: "+ d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Date end time local: " + d02);

		Instant d03 = Instant.now();
		System.out.println("Date end time in London or time global: "+d03);
		
		LocalDate d04 = LocalDate.parse("2024-04-26");
		System.out.println("add date in the format ISO: " + d04);

	}

}
