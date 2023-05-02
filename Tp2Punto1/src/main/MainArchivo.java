package main;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.Concurso;
import domain.Participante;
import persistencia.EnDiscoRegistroDeParticipantes;
import service.Inscripciones;
import service.JakartaEmailEnviadorDeCorreo;

public class MainArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Participante participante = new Participante("Dalmiro", 0, new ArrayList<Concurso>(),
				"dalmiromarcocci@gmail.com");
		Concurso concurso = new Concurso("El Mejor Asador", LocalDate.now().minusDays(1), LocalDate.now().plusDays(1),
				new ArrayList<Participante>(),
				new EnDiscoRegistroDeParticipantes("/home/tomas/Documentos/Universidad/OO2/concurso"),
				new JakartaEmailEnviadorDeCorreo("7424601f49d878", "a6b683f80d1fff", "sandbox.smtp.mailtrap.io",
						"el_mejor_asador@ejemplo.com", "Inscripcion", "Hola te registraste"));
		Inscripciones.contestsSignIn(participante, concurso);

	}

}
