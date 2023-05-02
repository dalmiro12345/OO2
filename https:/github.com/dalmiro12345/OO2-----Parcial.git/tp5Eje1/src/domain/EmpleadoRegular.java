package domain;

public class EmpleadoRegular implements Empleados {

	private int salario;

	public EmpleadoRegular(int salario) {
		super();
		this.salario = salario;
	}

	@Override
	public int salario() {
		// TODO Auto-generated method stub
		return this.salario;
	}

	@Override
	public void addEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		
	}

}
