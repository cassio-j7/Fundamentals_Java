package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import antitites.Coment;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Coment c1 = new Coment("Have a nive tripe!");
		Coment c2 = new Coment("Wow that's awsome.");
		
		Post p1 = new Post(sdf.parse("21/06/2018 15:40:22"), 
									"Trevaling to New Zeland", 
									"I'm going visit this wonderful country", 12);
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
	
	
	}

}
