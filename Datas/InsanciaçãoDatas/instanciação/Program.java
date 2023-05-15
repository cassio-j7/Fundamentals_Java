package instanciação;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//recebe a data atual do sitema(LocalDate)
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		//recebe a data e hora atual do sistema(LocalDateTime)
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		//recebe a data e hora atual do fuso-horario GMT(Instant)
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		//recebe um texto no formato data ISO8601 e transforma em data
		LocalDate d04 = LocalDate.parse("2023-05-10");
		System.out.println(d04);
		
		//recebe um texto no formato data-[hora] ISO8601 e tranforma para data
		LocalDateTime d05 = LocalDateTime.parse("2023-05-10T14:30:20");
		System.out.println(d05);
		
		//recebe um texto no formato data-[hora]-globalGTM e transforma em data
		Instant d06 = Instant.parse("2023-05-10T01:30:20Z");
		System.out.println(d06);
		
		//recebe um texto no formato data-[hora]-globalGMT como referencia e devolve o horaio de outro fuso horario em data
		Instant d07 = Instant.parse("2023-10-05T01:30:20-03:00");
		System.out.println(d07);
		
		//recebe uma data e formata segundo a necessidade do  usuário
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formato da data de fmt1
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Formato da data fmt2
		
		LocalDate d08 = LocalDate.parse("15/05/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("10/05/2023 01:30:22", fmt2);
		System.out.println(d08);
		System.out.println(d09);
		
		//recebe uma data separa por [ano], [mes] e [dia] separadamente
		LocalDate d10 = LocalDate.of(2023, 05, 10);
		System.out.println(d10);
		
		//recebe uma data separa por [ano], [mes], [dia] e [hora] separadamente
		LocalDateTime d11 = LocalDateTime.of(2023, 05, 10, 1, 30);
		System.out.println(d11);
				
		
	}

}
