package locator;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Empleado;

public class StreamLocator {

	static String dir = "c:\\ficheros-tarde\\empleados.json";	
	
	public static Stream<Empleado> streamEmpleados(){
		
		Gson gson = new Gson();
		
		try(FileReader reader=new FileReader(dir);){
						
			return Arrays.stream(gson.fromJson(reader, Empleado[].class));
			
		}catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
		
	}
	
}
