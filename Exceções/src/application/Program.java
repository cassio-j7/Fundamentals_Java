package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		
		System.out.println("End of program!");
		
	}
	public static void method1() {
	
		System.out.println("***Mthod1 Start***");
		method2();
		System.out.println("***Mthod1 Start***");
	}
	
	public static void method2() {
		
		System.out.println("***Method2 Start***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		//se o usuario digitar uma posição inválida
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		
		System.out.println("***Method2 End***");
		 		
		sc.close();	
	}

}
