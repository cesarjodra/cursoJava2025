package service;

import java.util.List;

import model.Empleado;

public interface EmpleadosService {
	List<Empleado> empleadosDepartamento(String departamento);
	public Empleado empleadoMayorSalario();
	public List<String> departamentos();
}
