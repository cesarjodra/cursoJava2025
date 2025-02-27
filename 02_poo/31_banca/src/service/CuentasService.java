package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Cuenta;

public class CuentasService {
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", 125477.44),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", 9465.59),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		    new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	// A partir de un número de cuenta indica si existe o no dicha cuenta
	
	public boolean cuentaExiste(String cuenta) {	
		return cuentas.stream()
				.anyMatch(n->cuenta.equals(n.getNumeroCuenta()));
	}
	
	// A partir de un nombre de divisa indica cuantas cuentas hay con dicha divisa
	
	public int mismaDivisa(String moneda) {	
		return (int)cuentas.stream()
				.filter(n->moneda.equals(n.getDivisa()))
				.count()
				;
	}
		
	// A partir de una fecha, el saldo medio de las cuentas creadas a partir
	// de dicha fecha
	
	public double saldoMedioFecha(LocalDate fecha) {	
		return cuentas.stream()
				.filter(n->n.getFechaApertura().isAfter(fecha))
				.mapToDouble(t->t.getSaldo())
				.average()
				.orElse(0)
				;
	}
		
	// A partir de un número de cuenta devuelve la cuenta asociada
	
	public Cuenta cuentaAsociada(String cuenta) {	
		return cuentas.stream()
				.filter(n->n.getNumeroCuenta().equals(cuenta))
				.findFirst()
				.orElse(null)
				;
	}
		
	// Devuelve la cuenta con mayor saldo
	
	public Cuenta mayorSaldo() {	
		return cuentas.stream()			
				.max( (a,b)-> Double.compare(a.getSaldo(), b.getSaldo()) )
				.orElse(null)
				;
	}
	
	// Devuelva un conjunto con las cuentas cuyo saldo supere el valor recibido como parámetro
	
	public Set<Cuenta> cuentasSaldoMayor(double saldo) {	
		return cuentas.stream()
				.filter(c->c.getSaldo()>saldo)
				.collect(Collectors.toSet())
		 		;
	}
	
	// Devuelva un conjunto con las cuentas y sus saldos
	public Map<String, Double> cuentasNumeroSaldo(){
		return cuentas.stream()				
				.collect(Collectors.toMap(c->c.getNumeroCuenta(), c->c.getSaldo()))				
		 		;
	}
	
	// Agrupar las cuentas por divisa
	
	public Map<String, List<Cuenta>> apruparPorDivisa(){
		return cuentas.stream()				
				.collect(Collectors.groupingBy(c->c.getDivisa()))
		 		;
	}
	
	// Agrupar las cuentas por antiguedad
		// Anteriores a 2000 y posteriores a 2000
	
		public Map<Boolean, List<Cuenta>> apruparPorFecha(){
			return cuentas.stream()				
				.collect(Collectors.partitioningBy(c->c.getFechaApertura().isBefore(LocalDate.of(2000,1,1))))
			 	;
		}
	
	
	
	
}
