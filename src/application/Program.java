package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		System.out.println("Date local: "+ d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Date end time local: " + d02);

		Instant d03 = Instant.now();
		System.out.println("Date end time in London or time global: "+d03);
		
		LocalDate d04 = LocalDate.parse("2024-04-26");
		System.out.println("Add date in the format ISO: " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2024-04-25T16:05:07.2525");
		System.out.println("Add date end time in the format ISO: "+d05);
		
		Instant d06 = Instant.parse("2024-05-25T15:26:25.242526Z");
		System.out.println("Add date end time global in the ISO:"+ d06);
		
		LocalDate d07 = LocalDate.parse("20/07/2024", fmt1);
		System.out.println("Adding dates formatting: "+d07.format(fmt1));
		
		LocalDate d08 = LocalDate.of(2024, 04, 28);
		System.out.println("Instantiate date with isolated data: "+d08);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Adding date and time formatting: " + d05.format(fmt2));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("Adding time zone: "+ fmt3.format(d06));
	}

}
