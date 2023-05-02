package service;

import domain.Concurso;
import domain.Participante;

public class Inscripciones {

	public static void contestsSignIn(Participante participante, Concurso concurso) {
		try {
			participante.contestsSignIn(concurso);
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
