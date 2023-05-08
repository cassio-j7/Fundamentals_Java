
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Cassio Jordan Ameida Alves";
		System.out.println("Original: -" + nome);
		
		//Transformar para maiusculo
			String s01 = nome.toUpperCase();
			System.out.println("UpperCase: - " + s01 + "-");
		
		//Transformar para minusculo
			String s02 = nome.toLowerCase();
			System.out.println("LowerCase: -" + s02 + "-");
			
		//para remover espaços no final da string
			String s03 = nome.trim();
			System.out.println("Trim: -" + s03 + "-");
		
		//recorta a string a partir de um index da posição informado
			String s04 = nome.substring(2);
			System.out.println("Substring: -" + s04 + "-");
		
		// recorta a string num intevalo informado, tendo como referencia o index da posição
			String s05 = nome.substring(2, 9);
			System.out.println("Substring: -" + s05 + "-");
		
		//troca um caratere informado por outro
			String s06 = nome.replace('a', 'x');
			System.out.println("Replace: (a) por (x): -" + s06 + "-");
		
		//troca um string informada por outra
			String s07 = nome.replace("Cassio", "Cadu");
			System.out.println("Replace: (Cassio) por (Cadu): -" + s07 + "-");
		
		//busca a primira posição (index) da string ou letra informada
			int i = nome.indexOf('s');
			System.out.println("IndexOf (s): - " + i + "-");
		
		//busca a ultima posição (index) da string ou letra informada
			int j = nome.lastIndexOf('s');
			System.out.println("LasIndexOf: (s): " + j + "-");
			
		//recorta a string a partir de um separador informado
			String[] vet = nome.split(" ");
			System.out.println(vet[0]);
			System.out.println(vet[1]);
			System.out.println(vet[2]);
			System.out.println(vet[3]);
			
			
	}

}
