package domain;

import domain.portsin.GrabarInscripciones;
import domain.portsout.GuardarInscripciones;

public class DefaultGrabarInscripciones implements GrabarInscripciones {

	private GuardarInscripciones inscripcion;

	public DefaultGrabarInscripciones(GuardarInscripciones inscripcion) {
		super();
		this.inscripcion = inscripcion;
	}

	@Override
	public void saveInscription(String apellido, String nombre, String telefono, String email, String idConcurso) {
		// TODO Auto-generated method stub
		Participante participante = new Participante(nombre, apellido, email, telefono);
		inscripcion.grabarInscripciones(participante.toRecord(), idConcurso);

	}

}
