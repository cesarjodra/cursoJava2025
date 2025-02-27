package service;

import java.util.List;
import java.util.stream.Stream;

import locator.StreamLocator;
import model.Empleado;

public class EmpleadosApp implements EmpleadosService {
	
	Stream<Empleado> empleadosStream = StreamLocator.streamEmpleados();

	@Override
	public List<Empleado> empleadosDepartamento(String departamento) {
		
		return empleadosStream
				.filter(d->d.getDepartamento().equals(departamento))
				.toList();
	}

	@Override
	public Empleado empleadoMayorSalario() {
		return empleadosStream
				.sorted( (a,b) -> Double.compare(a.getSalario(), b.getSalario()) ) 
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<String> departamentos() {
		return empleadosStream
				.map(d->d.getDepartamento())
				.distinct()
				.toList();
	}

}
