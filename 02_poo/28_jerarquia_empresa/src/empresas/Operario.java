package empresas;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;

/*
 * No quiero automatizarlos, para "capar" los setters
	@AllArgsConstructor
	@NoArgsConstructor
	@Data // Este no
*/

@Getter //Este sí, porque no escribe

/*
 * Clase Operario
    Es una subclase de Empleado, que incluirá un atributo llamado nivel (int)
    Sobrescribe el método incentivar siguiendo el siguiente algoritmo:
    si la edad del empleado es superior a 30 y su nivel es superior a 2, su salario se 
    incrementará en dos veces el bono
    si solo cumple una de la condiciones anteriores, su salario se incrementará en 
    el valor del bono

    Además añadirá el método actualizar nivel: si el nivel es inferior a 5 y el empleado
    lleva más de dos años en la empresa, se le subirá un nivel   
 * 
 * */

public class Operario extends Empleado {
	private int nivel;
	
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		// Los niveles solo pueden estar comprendidos entre 1 y 5
			// Por eso no lo genero automaticamente con Lombok
		if(nivel<=5 && nivel>0) {
			this.nivel=nivel;
		}
		else { // Si el nivel no es válido, provocamos una excepción
			throw new IllegalArgumentException();
		}
	}
	
	public void setNivel(int nivel) {
		if(nivel<=5 && nivel>0) {
			this.nivel=nivel;
		}
		else { // Si el nivel no es válido, provocamos una excepción
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void incentivar() {
		if( getEdad()>30 && nivel>2 ) {
			setSalario(getSalario()+BONO*2);
		}
		else if( getEdad()>30 || nivel>2 ) {
			setSalario(getSalario()+BONO);
		}
	}
	
	public void actualizarNivel() {
		
		Period p = Period.between(getFechaIngreso(), LocalDate.now());
		if( nivel<5 && p.getYears()>2 ) {
			nivel++;
		}
		
		/*LocalDate fechaActual = LocalDate.now();
		LocalDate fechaMasDos = getFechaIngreso().plusYears(2);
		
		if( nivel<5 && fechaActual.compareTo(fechaMasDos)>2 ) {
			nivel++;
		}*/
	}

}
