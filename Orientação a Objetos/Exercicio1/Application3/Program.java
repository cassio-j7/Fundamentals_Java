package Application3;

/*************************************************************
 * Fazer um programa para ler os valores de largura e altura 
 * de um retangulo. Em seguida, mostar na tela o valor de sua 
 * área, perímetro e diagonal. Usar uma classe.
 * 
 ************************************************************/

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle p = new Rectangle();
		
		System.out.println("Enter the numbers of measures of rectangle: ");
		p.width = sc.nextDouble();
		p.height = sc.nextDouble();
		
		System.out.println("The values ​​are: ");
		System.out.println("Area: " + p.area());
		System.out.println("Perimeter: " + p.perimeter());
		System.out.println("Diagonal: " + p.diagonal());
		
		
		
		
		
		
		sc.close();

	}

}
