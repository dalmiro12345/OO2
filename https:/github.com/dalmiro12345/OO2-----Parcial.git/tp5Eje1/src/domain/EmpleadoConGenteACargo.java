package domain;

import java.util.List;

public class EmpleadoConGenteACargo implements Empleados {

	private int salario;
	List<Empleados> empleados;

	public EmpleadoConGenteACargo(int salario, List<Empleados> empleados) {
		super();
		this.salario = salario;
		this.empleados = empleados;
	}

	@Override
	public int salario() {
		// TODO Auto-generated method stub
		int salarioEmpleados = 0;
		for (Empleados p : this.empleados) {
			salarioEmpleados = salarioEmpleados + p.salario();
		}
		return this.salario + salarioEmpleados;
	}

	@Override
	public void addEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);
	}

}
