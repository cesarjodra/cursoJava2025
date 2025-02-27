package main;

import com.google.gson.Gson;

import model.Persona;

public class VolcadoCadena {

	public static void main(String[] args) {
		
		// Bloque de texto (Desde java14, con triple comilla)
			// Lo de dentro tiene que ir en fila independiente
		String personaJson = """
				{"nombre":"Ejemplo",
				"edad":21,
				"email":"asad@gmail.com"}
				""";
		
		Gson gson = new Gson();
		
		Persona persona = gson.fromJson(personaJson, Persona.class);
		
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Email: " + persona.getEmail());

	}

}
