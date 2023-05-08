package Application1;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração de objetos do  tipo Triangle.
		Triangle x, y;
		
		//instanciação de dois objetos do tipo Triangle
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter de measures of triangle X: ");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter de measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
			if(areaX > areaY) {
				System.out.println("Higher area X");
			}
			else {
				System.out.println("Higher area Y");
			}
		
		sc.close();
	}

}
