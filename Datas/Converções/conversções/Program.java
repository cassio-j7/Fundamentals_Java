package conversções;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2023-05-10");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-10T01:30:52");
		Instant d03 = Instant.parse("2023-05-10T01:30:52Z");
		
		//Conversão de data-[hora]-Global para Local da máquina
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(r1);
		
		//Conversão de data-[hora]-Global para Local especifico
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(r2);
		
		//Conversão de data-[hora]-Global para Local da máquina(com hora)
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
				System.out.println(r3);
				
		//Conversão de data-[hora]-Global para Local especifico (com hora)
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(r4);
		
		System.out.println("====================");
		
		//Para pegar uma item da data de forma isolada, como: dia, mes ano...
		System.out.println("dia do mes: " + d01.getDayOfMonth());
		System.out.println("dia da semana: " + d01.getDayOfWeek());
		System.out.println("quantidade de dias no ano" + d01.getDayOfYear());
		System.out.println("numero do mes no ano: " + d01.getMonthValue());
		System.out.println("ano atual: " + d01.getYear());
		System.out.println("numero de dias do mes atual: " + d01.lengthOfMonth());
		System.out.println("numero de dias do ano atual: " + d01.lengthOfYear());
	
		
		
	}

}
