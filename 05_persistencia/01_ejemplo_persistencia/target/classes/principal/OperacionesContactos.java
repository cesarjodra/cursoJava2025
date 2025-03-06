package principal;

import service.ContactosService;

public class OperacionesContactos {

	public static void main(String[] args) {
		ContactosService service = new ContactosService();
		
		// BUSCAR CONTACTO
		/*Contacto contacto=service.buscarContacto(5);		
		System.out.println("Nombre: "+contacto.getNombre());
		System.out.println("Nombre: "+contacto.getEmail());
		System.out.println("Nombre: "+contacto.getEdad());*/
		
		// ALTA DE CONTACTO
		/*Contacto contacto = new Contacto(0, "Contacto JPA", "jpa@gmail.com", 44);
		service.altaContacto(contacto);
		System.out.println("Contacto añadido !!");*/
		
		// LISTAR TODOS
		/*List<Contacto> contactos=service.recuperarTodos();
		contactos.forEach(c->System.out.println(c.getNombre()));*/
		
		// BUSCAR POR EMAIL		
		/*Optional<Contacto> contacto = service.buscarContactoEmail("carlos@gmail.com");
		
		contacto.ifPresentOrElse(c->System.out.println(c.getNombre()), 
								()->System.out.println("No hay ningún resultado."));*/
		
		// ELIMINAR POR EMAIL		
		/*service.eliminarContacto("contacto6");*/

	}

}
