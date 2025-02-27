package main;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import model.Persona;

public class Volcado {

	public static void main(String[] args) {
		// Hemos instalado por Maven la librería GSON, para leer archivos JSON
		
		// Usamos la clase Gson, instanciandola para tener el objeto para acceder al fichero
		
		Gson gson = new Gson();
		
		// Leemos el fichero
		String dir = "c:\\ficheros-tarde\\persona.json";
		try(FileReader reader=new FileReader(dir);){
			
			// Hay que decirle de donde tiene que coger el fichero,
				// y a que objeto lo debe transformar
			
			// Esto si fuera un unico objeto
			// Persona persona = gson.fromJson(reader, Persona.class);
			
			// Si es un array de objetos JSON
			Persona[] personas = gson.fromJson(reader, Persona[].class);
			
			for(Persona persona:personas) {
				System.out.println("Nombre: " + persona.getNombre());
				System.out.println("Edad: " + persona.getEdad());
				System.out.println("Email: " + persona.getEmail());
				System.out.println("---------------");
			}
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
