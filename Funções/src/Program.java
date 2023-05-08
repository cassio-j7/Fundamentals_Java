import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
	
	}
	
	public static int max(int num1, int num2, int num3) {
		int aux;
		
		if(num1 > num2 && num1 > num3) {
			aux = num1;
		}
		if(num2 > num3) {
			aux = num2;
		}
		else {
			aux = num3;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("The higher is: " + value + ".");
	}

}
