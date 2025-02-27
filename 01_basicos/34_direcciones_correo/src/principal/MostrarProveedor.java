package principal;

public class MostrarProveedor {

	public static void main(String[] args) {

		String[] correos={
				"cesar.jodra@gmail.com",
				"pepe@hotmail.com",
				"johndoe@latinmail.mx",
				"janedoe@eresmas.com",
				"juannadie@terra.es"
		};

		// Muestra el nombre de los proveedores
		
		for(String n:correos) {
			// Hallar arroba y punto
			int arroba = n.indexOf("@");
			int punto = n.lastIndexOf(".");
			
			String proveedor = n.substring(arroba+1,punto);
			System.out.println(proveedor);
		}
		
	}

}
