package exercicio3;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first date: ");		
		LocalDate d1 = LocalDate.parse(sc.next());
		
		System.out.println("Enter the second date: ");
		LocalDate d2 = LocalDate.parse(sc.next());
		
		//converter para LocalDateTime
		Duration duration = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
		
		System.out.println("Duration: " + duration.toDays() + " dias");
		
		sc.close();

	}

}
