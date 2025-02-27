package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TestHttp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url ="https://www.google.es";
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();
			
		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_1_1)
				.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		System.out.println(response.body());

	}

}
