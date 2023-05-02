package domain;

import java.util.List;

public class Participante {

	private String nombre;
	private int puntos;
	private String email;
	private List<Concurso> concursos;

	public Participante(String nombre, int puntos, List<Concurso> concursos, String email) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.concursos = concursos;
		this.email = email;
	}

	public void addPoints(int puntos) {
		this.puntos = this.puntos + puntos;
	}

	public void contestsSignIn(Concurso concurso) {
		concurso.toSubscribe(this);
		this.concursos.add(concurso);
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public boolean iscontestSignIn(Concurso concurso) {
		return this.concursos.contains(concurso);
	}

	String email() {
		return email;
	}

	String nombre() {
		return nombre;
	}

}
