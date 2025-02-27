package empresas;

import java.time.LocalDate;
import java.time.Period;

/*
Clase Director
Es una subclase de Empleado, que incluirá dos atributos:
    departamento y personalCargo (int)
Sobrescribe el método incentivar siguiendo el siguiente criterio:
Si lleva tres o más años en la empresa y tiene más de 10 personas a su cargo,
su salario se incrementará en dos veces el bono
si solo cumple una de la condiciones anteriores, su salario se incrementará
    en el valor del bono

 */

public class Director extends Empleado {

	private String departamento;
	private int personalCargo;
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonalCargo() {
		return personalCargo;
	}

	public void setPersonalCargo(int personalCargo) {
		this.personalCargo = personalCargo;
	}

	@Override
	public void incentivar() {
		
		Period p = Period.between(getFechaIngreso(), LocalDate.now());
				
		if( p.getYears()>=3 && personalCargo>10 ) {
			setSalario(getSalario()+BONO*2);
		}
		else if( p.getYears()>=3 || personalCargo>10 ) {
			setSalario(getSalario()+BONO);
		}

	}

}
