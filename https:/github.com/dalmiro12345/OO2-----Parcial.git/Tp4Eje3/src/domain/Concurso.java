package domain;

import java.time.LocalDate;

public class Concurso {

	@SuppressWarnings("unused")
	private long id;
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private LocalDate fechaInicio;
	@SuppressWarnings("unused")
	private LocalDate fechaFin;

	public Concurso(long id, String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

}
