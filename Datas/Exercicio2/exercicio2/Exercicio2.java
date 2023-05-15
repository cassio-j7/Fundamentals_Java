package exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter new date: ");
		LocalDate date = LocalDate.parse(sc.next());
		
		System.out.println("Date: " + ftm.format(date));
		System.out.println("Day: " + date.getDayOfMonth());
		System.out.println("Month: " + date.getMonthValue());
		System.out.println("Year: " + date.getYear());
		
		sc.close();
	}

}
