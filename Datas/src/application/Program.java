package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciação com data atual
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		//instanciação do horario atual 
		LocalDateTime h01 = LocalDateTime.now();
		System.out.println(h01);
		
		//instanciação data hora global
		Instant d02 = Instant.now();
		System.out.println(d02);
		
		//Texto ISO8601 para Data-hora
		LocalDate d03 = LocalDate.parse("2023-03-10");
		System.out.println(d03);
		
		LocalDateTime d04 = LocalDateTime.parse("2023-03-10T06:30:12");
		System.out.println(d04);
		
		Instant d05 = Instant.parse("2023-03-10T06:35:20Z");
		System.out.println(d05);
		
		//Texto formato customizado para DataHora
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d06 = LocalDate.parse("10/03/2022",ftm1);
		System.out.println(d06);
		
		LocalDateTime d07 = LocalDateTime.parse("10/03/2023 06:50", ftm2);
		System.out.println(d07);
		
		// dia, mes e ano
		LocalDate d08 = LocalDate.of(2023, 03, 10);
		System.out.println(d08);

		//Data para formato Testo ISO8601
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("2023-03-10");
		System.out.println(d09.format(fmt3));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d10 = LocalDateTime.parse("2023-03-10T07:10:00");
		System.out.println(d10.format(fmt4));
		
	}

}
