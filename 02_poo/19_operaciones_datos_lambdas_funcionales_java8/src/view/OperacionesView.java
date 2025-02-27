package view;

import java.util.List;
import java.util.Set;

import service.Operaciones;

public class OperacionesView {

	public static void main(String[] args) {
		
		List<Integer> lista = List.of(5,8,-1,-6,4,-2,11,25);
		
		List<Integer> listado = List.of(14,21,-5,-45,8,-3,25,-9);
		Set<Integer> conjunto = Set.of(21,8,-9,56,-7,-48,66,32,-1,0);		
		
		Operaciones operaciones=new Operaciones();
		
		// Mostrar:
		
		// Suma de positivos, usando una expresión lambda:		
		System.out.println("Suma de positivos: "+operaciones.sumaPorCondicion(lista, a->a>=0));
		
		// Suma de impares, usando una expresión lambda:		
		System.out.println("Suma de impares: "+operaciones.sumaPorCondicion(lista, a->a%2!=0));
		
		// Suma de multiplos de 5, usando una expresión lambda:		
		System.out.println("Suma de múltiplos de 5: "+operaciones.sumaPorCondicion(lista, a->a%5==0));

		List<String> listaTextos = List.of("perro azul", "gato atrigrado mimoso", "tigre que come cebras", "cebra huyendo de un tigre rabioso");
		
		// Contar letras, usando una expresión lambda:		
		System.out.println("Número de letras: "+operaciones.transformarCadenas(listaTextos, a->a.length()));
		
		// Contar espacios, usando una expresión lambda:		
		System.out.println("Número de espacios: "+operaciones.transformarCadenas(listaTextos,a->{
			int espacios = 0;
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i) == ' ') {
					espacios++;
					}
			}		
			return espacios;
		} ));

		// imprime los pares
		System.out.print("\nNúmeros pares: ");
		operaciones.procesarConCondicion(listado, a->a%2==0, a->System.out.print(a+" "));

		System.out.print("\nNúmeros negativos: ");
		// imprime los negativos
		operaciones.procesarConCondicion(conjunto, a->a<0, a->System.out.print(a+" "));
		
		
		
	}	

}