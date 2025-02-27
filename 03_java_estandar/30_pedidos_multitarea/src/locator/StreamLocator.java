package locator;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import deserializadores.LocalDateDeserializer;
import model.Pedido;

public class StreamLocator{
	
	public static Stream<Pedido> streamPedidos(String ruta){
	
		Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .create();
		
		try(FileReader fr=new FileReader(ruta);){
			
			return Arrays.stream(gson.fromJson(fr, Pedido[].class));
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
		
	}
	
}