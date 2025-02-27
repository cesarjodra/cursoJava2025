package main;

import java.util.HashMap;
import java.util.Map;

public class TestForEachMap {

	public static void main(String[] args) {
		Map<Integer,String> empleados = new HashMap<>();
		empleados.put(100, "empleado1");
		empleados.put(500, "empleado2");
		empleados.put(800, "empleado3");
		empleados.put(250, "empleado4");
		
		// Mostrar nombre del empleado, un guión y su código
		
		empleados.forEach( (k,v)-> System.out.println(v+" - "+k) );

	}

}
