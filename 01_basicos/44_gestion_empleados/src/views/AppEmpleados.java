package views;

import java.util.Scanner;
import service.EmpleadosService;

public class AppEmpleados {
	static EmpleadosService empleadosService = new EmpleadosService();
	public static void main(String[] args) {		

		// Mostrar menu en pantalla y esperar respuesta
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {				
			System.out.println(
					"MENU DE OPCIONES: \r\n"
					+ "1.- Nuevo empleado\r\n"
					+ "2.- Buscar empleado\r\n"
					+ "3.- Eliminar empleado\r\n"
					+ "4.- Ver todos los empleados\r\n"
					+ "5.- Salir\r\n"
					+ "Introduzca la opción deseada");
			opcion = scan.nextInt();
			
			switch(opcion) {
				
				case 1 -> altaEmpleado(); 
				case 2 -> buscaEmpleado(); 
				case 3 -> bajaEmpleado();
				case 4 -> verEmpleados();
			}
			
		}while(opcion != 5);		
		
	}
	
	// Método de alta de empleado
	
	static void altaEmpleado() {		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Introduzca el código del empleado");
			Integer code = Integer.parseInt(scan.nextLine());
		System.out.println("Introduzca el nombre del empleado");
			String userName = scan.nextLine();	
			
		boolean alta = empleadosService.altaEmpleado(code, userName);
		if(alta) {
			System.out.println("El empleado ha sido dado de alta");
		}
		else {
			System.out.println("Ese código de empleado ya existe. Inténtelo otra vez");
		}
		System.out.println("----------------------------------------------------\n");
	}
	
	// Método de búsqueda de empleado
	
	static void buscaEmpleado() {						
		Scanner scan = new Scanner(System.in);	
		System.out.println("Introduzca el código del empleado");
			Integer code = Integer.parseInt(scan.nextLine());		
			
		String nombre = empleadosService.buscaEmpleado(code);
		if(nombre != null) {
			System.out.println("El empleado es "+nombre);
		}
		else {
			System.out.println("Ese empleado no trabaja en esta empresa");
		}
		System.out.println("----------------------------------------------------\n");
	}
	
	// Método de baja de empleados
	
	static void bajaEmpleado() {						
		Scanner scan = new Scanner(System.in);	
		System.out.println("Introduzca el código del empleado");
			Integer code = Integer.parseInt(scan.nextLine());
			
		String nombre = empleadosService.bajaEmpleado(code);
		if(nombre != null) {
			System.out.println("El empleado dado de baja es: "+nombre);
		}
		else {
			System.out.println("Ese empleado no trabaja en esta empresa");
		}
		System.out.println("----------------------------------------------------\n");
	}
	
	
	// Método de listar empleados
	
	static void verEmpleados() {		
		String[] listado = empleadosService.listadoCompleto();
		for(String n:listado) {
			System.out.println(n);
		}		
		System.out.println("----------------------------------------------------");
	}
	
}