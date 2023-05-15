package exercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Move name: ");
		String name = sc.nextLine();
		
		System.out.println("Location date: ");
		LocalDate dateL = LocalDate.parse(sc.next());
		
		System.out.println("Location date: ");
		LocalDate dateD = LocalDate.parse(sc.next());
		
		Duration temp = Duration.between(dateL.atStartOfDay(), dateD.atStartOfDay());
		
		
		
		if( temp.toDays()  > 5) {
			double tax = 10.0;
			double trafficTicket = tax * 3.0;
			System.out.printf("Total payment: %.2f%n", trafficTicket);
		}
		else if(temp.toDays()  > 3) {
			double tax = 5.0;
			double trafficTicket = tax * 3.0;
			System.out.printf("Total payment: %.2f%n", trafficTicket);
		}
		else {
			double trafficTicket = 3.0;
			System.out.printf("Total payment: %.2%n", trafficTicket);
		}
		
		sc.close();
	}

}
