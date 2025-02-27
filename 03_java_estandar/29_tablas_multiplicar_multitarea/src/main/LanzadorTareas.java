package main;

import java.util.Scanner;

import tareas.Tabla;

public class LanzadorTareas {

	public static void main(String[] args) {
		
		int ejecuciones = 3;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=ejecuciones;i++) {			
			System.out.println("Introduce el numero "+i);
			int num = scan.nextInt();
			
			var tarea = new Tabla(num);		
			new Thread(tarea).start();
		}		
	}
}
