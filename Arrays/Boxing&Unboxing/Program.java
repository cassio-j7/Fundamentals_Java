
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 20;
		System.out.println(x);
		System.out.println();
		
		//Boxing -> conversão de um ojeto tipo valor para um tipo referencia
		Object obj = x;
		System.out.println(obj);
		System.out.println();
		
		//Unboxing -> conversão de um obejto tipo referencia para um tipo valor
		int y = (int) obj;
		System.out.println(y);
		System.out.println();

	}

}
