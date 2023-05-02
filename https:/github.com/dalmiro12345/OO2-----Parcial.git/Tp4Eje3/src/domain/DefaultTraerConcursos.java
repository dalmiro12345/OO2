package domain;

import java.util.List;

import domain.portsin.ConcursoRecord;
import domain.portsin.TraerConcursos;
import domain.portsout.CargarConcursos;

public class DefaultTraerConcursos implements TraerConcursos {

	private CargarConcursos concursos;

	public DefaultTraerConcursos(CargarConcursos concursos) {
		super();
		this.concursos = concursos;
	}

	@Override
	public List<ConcursoRecord> todosLosConcursos() {
		// TODO Auto-generated method stub
		return concursos.cargarConcursosVigentes();
	}

}
