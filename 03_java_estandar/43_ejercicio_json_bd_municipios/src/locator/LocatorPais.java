package locator;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.JsonMunicipios;
import model.JsonProvincias;
import model.Municipio;
import model.Provincia;

public class LocatorPais {
	
	public static Stream<Provincia> streamProvincias(){
		Gson gson = new Gson();
		try{
		
			String url ="https://www.el-tiempo.net/api/json/v2/provincias";	
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.GET()
					.build();
				
			HttpClient client = HttpClient.newBuilder()
					.version(Version.HTTP_1_1)
					.build();
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			JsonProvincias jsProvincias = gson.fromJson(response.body(), JsonProvincias.class);
			
			return Arrays.stream(jsProvincias.getProvincias());
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
		
	}
	
	public static Stream<Municipio> streamMunicipios(String codigoProvincia){
		System.out.println(codigoProvincia+"-------------");
		Gson gson = new Gson();
		try{
		
			String url ="https://www.el-tiempo.net/api/json/v2/provincias/"+codigoProvincia+"/municipios";	
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.GET()
					.build();
				
			HttpClient client = HttpClient.newBuilder()
					.version(Version.HTTP_1_1)
					.build();
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			JsonMunicipios jsMunicipios = gson.fromJson(response.body(), JsonMunicipios.class);
			
			return Arrays.stream(jsMunicipios.getMunicipios());
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
		
	}
	
}