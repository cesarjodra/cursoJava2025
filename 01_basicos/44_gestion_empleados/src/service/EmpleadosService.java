package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EmpleadosService {	
	HashMap<Integer,String> empleados = new HashMap<>();
	
	// Método 1: Alta de empleado
		//Se pide el codigo y nombre del empleado. Se añade el empleado si el código no existe
		//Si el código está ocupado, no se añade el empleado y se muestra mensaje
	
	public boolean altaEmpleado(Integer codigo, String nombre) {			
		boolean resultado = true;
		if(!empleados.containsKey(codigo)) {			
			empleados.put(codigo, nombre);			
		}
		else {
			resultado = false;
		}
		return resultado;
		
	}
	
	
	// Método 2: Buscar y mostrar empleado
		//Se pide el código del empleado y se muestra su nombre.
	
	public String buscaEmpleado(Integer codigo) {			
		String resultado = null;
		if(empleados.containsKey(codigo)) {			
			resultado = empleados.get(codigo);			
		}		
		return resultado;		
	}
	
	// Método 3: para eliminar empleado
		// Se pide el código del empleado y se elimina, mostrando el nombre
		// del empleado eliminado.
	
	public String bajaEmpleado(Integer codigo) {		
		String resultado = null;
		if(empleados.containsKey(codigo)) {			
			resultado = empleados.remove(codigo);			
		}		
		return resultado;
	}
	
	// Método 4: para ver todos los empleados
		// Se mostrarán los nombres de todos los empleados
	
	public String[] listadoCompleto() {
			String[] lista = new String[empleados.size()];
			int i=0;
			Collection<String> nombres = empleados.values();
			for(String n:nombres) {
				lista[i]=n;
				i++;
			}			
			return lista;		
	}
}