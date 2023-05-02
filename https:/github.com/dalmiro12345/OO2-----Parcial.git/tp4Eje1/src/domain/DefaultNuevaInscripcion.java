package domain;

import domain.portsin.NuevaInscripcion;
import domain.portsout.Inscripciones;

public class DefaultNuevaInscripcion implements NuevaInscripcion {

	Inscripciones inscripcion;

	public DefaultNuevaInscripcion(Inscripciones inscripcion) {
		super();
		this.inscripcion = inscripcion;
	}

	@Override
	public void nuevoParticipante(String nombre, String telefono, String region) {
		// TODO Auto-generated method stub
		this.inscripcion.cargarParticipante(nombre, telefono, region);

	}

}
