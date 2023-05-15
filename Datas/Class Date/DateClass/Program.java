package DateClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
		
		/*
		 * 	Um objeto Date internamente armazena: 
		 * 		- O numero de milissegundos desde a meia noite do dia 1 de janeiro de 1970GMT(UTC)
		 * 		- GMT: Greenwich Mean Time(time zone)
		 * 		- UTC: Coordinated Universal Time(time standard)
		 * */
		Date y =  new Date(System.currentTimeMillis());
		
		//https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
		
		/*
		 * 	Define formatos para conversão entre Date e String
		 * 
		 *		- dd/MM/yyyy -> 23/07/2018
		 *		- dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07
		 *
		 * */
		
		//Formatação de datas com SimpleDateFormat
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2026");
		Date y2 = sdf2.parse("25/06/2022 15:42:07");
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y));
		
		// Recebe uma data no formato Date e transforma para o formato definido pelo SimpleDateFormat
		LocalDate y3 = LocalDate.parse("2023-05-25");
		System.out.println(sdf1.format(y1));
		
		
		
		
	}

}
