package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ESTO ES LA ENTIDAD EN UNA CAPA DE PERSISTENCIA
//////////////////////////////////////////////////
// Nuevo comentario

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity // Lo convierte en entidad
@Table(name="contactos") // Indica el nombre de la tabla
public class Contacto {
	@Id //Indica cual es la Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que es AI 
	private int idContacto;
	private String nombre;
	//@Column(name="email") // Si el nombre del campo no coincide con la variable
	private String email;
	private int edad;
}
