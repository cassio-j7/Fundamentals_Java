package calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:03Z"));
		
		
		System.out.println(sdf.format(d));
		
		//Acrecentar 4 horas a esta data
		//instanciação do calendar
		Calendar cal = Calendar.getInstance();
		
		//instanciação da data d dentro do calendario
		cal.setTime(d);
		
		//Adicionado 4 horas do dia na data d
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		//atualização da data d
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//Pegar elementos da data separadamente
		
		//Pegando os horas
		int hora = cal.get(Calendar.HOUR);
		System.out.println(hora);
		
		//Pegando os minutos
		int minutos = cal.get(Calendar.MINUTE);
		System.out.println(minutos);
				
				
		//Pegando os segundos
		int segundos = cal.get(Calendar.SECOND);
		System.out.println(segundos);
		
		//Pegando o dia(numero do dia da semana)
		int dia = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dia);
		
		//Pegando o mes(numero do mes no ano)
		int mes = cal.get(Calendar.MONTH);
		System.out.println(mes + 1);
		
		//Pegando o ano
		int ano = cal.get(Calendar.YEAR);
		System.out.println(ano);
		
		
		
	}

}
