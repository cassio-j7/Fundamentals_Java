package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangule;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the nuber of shpes: ");
		int n = sc.nextInt();
		
		for (int i = 1; 1 <= n; i++) {
			System.out.println("Shape #"+ i + " data: ");
			System.out.println("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK, BLUE, RED)");
			Color color = Color.valueOf(sc.next());
			
				if (ch == 'r') {
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.println("Height: ");
					double height = sc.nextDouble();
					list.add(new Rectangule(color, width, height));
				}
				else {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					list.add(new Circle(color, radius));
				}
			
		}
		System.out.println();
		System.out.println("Shapes Area: ");
		for (Shape shape : list) {
			System.out.printf("Area é %.2f%n", shape.area());
		}

		sc.close();
	}

}
