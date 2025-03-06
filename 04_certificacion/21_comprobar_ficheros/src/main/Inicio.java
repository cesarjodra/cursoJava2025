package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Inicio {

	public static void main(String[] args) throws IOException {

		Path pt=Path.of(args[0]);
		
		if(pt.toFile().exists()) {
			Stream<Path> st= Files.walk(pt) ;
			
		st
			.filter(p->p.toString().endsWith(".java"))
			.filter(p->{
				try {
					return Files.lines(p).anyMatch(s->s.contains("new Scanner"));
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			})
			//.map(n->n.getFileName().toString())			
			.forEach(System.out::println);
			
		}
		else {
			System.out.println("El directorio no existe.");
		}

	}

}
