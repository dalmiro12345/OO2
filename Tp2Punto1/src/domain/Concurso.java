package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Concurso {
	private String nombre;
	private LocalDate initialDate;
	private LocalDate finishDate;
	private List<Participante> participantes;
	public static final int FIRST_DAY_INSCRIPTION_POINTS = 10;
	private RegistroDeParticipantes registro;
	private EnviadorDeCorreo email;

	public Concurso(String nombre, LocalDate initialDate, LocalDate finishDate, List<Participante> participantes,
			RegistroDeParticipantes registro,EnviadorDeCorreo email) {

		if (initialDate == null) {
			throw new RuntimeException("La fecha de inicio no puede estar vacia");
		}
		this.initialDate = initialDate;
		if (finishDate == null) {
			throw new RuntimeException("La fecha de fin no puede estar vacia");
		}
		this.finishDate = finishDate;

		this.participantes = participantes;

		this.registro = registro;
		
		this.nombre = nombre;
		
		this.email=email;
	}

	private void isActive() {
		if (initialDate.isAfter(LocalDate.now()) || finishDate.isBefore(LocalDate.now())) {
			throw new RuntimeException("La Campania no esta Vigente");
		}

	}

	public void toSubscribe(Participante participante) {

		this.isActive();
		if (this.initialDate.isEqual(LocalDate.now())) {
			participante.addPoints(FIRST_DAY_INSCRIPTION_POINTS);
		}
		this.registro.registrarParticipante(LocalDateTime.now()+ ", " + participante.nombre()+", "+this.nombre);
		this.email.sendEmail(participante.email());
		this.participantes.add(participante);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concurso other = (Concurso) obj;
		return finishDate.isEqual(other.finishDate) && initialDate.isEqual(other.initialDate);
	}

}
