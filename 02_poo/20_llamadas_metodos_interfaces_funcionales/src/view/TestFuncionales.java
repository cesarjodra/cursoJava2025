package view;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class TestFuncionales {

	public static void main(String[] args) {
		FuncionalesService service = new FuncionalesService();
		List<String> lista = List.of("hola", "adios");
		List<Integer> listaNum = List.of(3,6,9,8,5);
		Set<Integer> conjunto = Set.of(21,8,-9,56,-7,-48,66,32,-1,0);
		Map<String,Integer> mapa = Map.of("Pedro", 1234);
		
		// Realizar una llamada a cada uno de los 7 metodos de la clase service
		
		service.m1( conjunto, a-> a.length() );
		
		service.m2( ()->{String b="hello";return b;} , a-> System.out.println("Hecho!") );
		
		service.m3( (a,b)->a*b , (a,b)-> a+b.length() );
		
		service.m4( (a,b)->System.out.println(a.length()-b) , (a,b)-> a.length()>b );
		
		service.m5( ()->6, lista) ;
		
		service.m6( mapa, (a,b)->System.out.println(a+b) );
		
		service.m7( a-> List.of(Integer.parseInt(a)) );

	}

}
