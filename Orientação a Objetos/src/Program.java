import java.util.Locale;
import java.util.Scanner;

/*
 * Resolvendo um probelma sem orientação a objeto.
 * */

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter de measures of triangle X: ");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Enter de measures of triangle Y: ");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		double p = (xA + xB+ xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC)/ 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: $.4f%n", areaX);
		System.out.printf("Triangle X area: $.4f%n", areaY);
		
			if(areaX > areaY) {
				System.out.println("Higher area X");
			}
			else {
				System.out.println("Higher area Y");
			}
		
		sc.close();
	}

}
