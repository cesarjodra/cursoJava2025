package principal;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Ana");
		nombres.add("Javier");
		nombres.add("Alberto");
		nombres.add(2, "Prueba");
		
		for(String n:nombres) {System.out.println(n);}
		
		nombres.set(2, "César");
		
		for(String n:nombres) {System.out.println(n);}
		
		System.out.println(nombres.get(0));
		System.out.println(nombres.size());
		
		nombres.remove(2);
		
		for(String n:nombres) {System.out.println(n);}
		
		System.out.println(nombres.get(2));
	}

}
