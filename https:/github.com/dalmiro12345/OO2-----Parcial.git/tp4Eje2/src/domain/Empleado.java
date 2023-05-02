package domain;

import java.time.LocalDate;

import domain.portsout.Notificacion;

public class Empleado {

	private String nombre;
	private String apellido;
	private LocalDate fNacimiento;
	private String email;

	public Empleado(String nombre, String apellido, LocalDate fNacimiento, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.email = email;
	}

	boolean esCumpleanios() {
		return LocalDate.now().isEqual(this.fNacimiento);
	}

	String email() {
		return email;
	}

}
