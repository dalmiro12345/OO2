package domain;

import domain.portsout.ParticipanteRecord;

public class Participante {

	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido;
	@SuppressWarnings("unused")
	private String email;
	@SuppressWarnings("unused")
	private String telefono;

	public Participante(String nombre, String apellido, String email, String telefono) {
		super();
		if (nombre == null || nombre.isBlank()) {
			throw new RuntimeException("El nombre no puede estar vacio");
		}
		this.nombre = nombre;
		if (apellido == null || apellido.isBlank()) {
			throw new RuntimeException("El apellido no puede estar vacio");
		}
		this.apellido = apellido;
		if (email == null || email.isBlank() && this.checkEmail(email)) {
			throw new RuntimeException("El email debe ser valido");
		}
		this.email = email;
		if (telefono == null || telefono.isBlank() && this.checkPhone(telefono)) {
			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
		}
		this.telefono = telefono;
	}

	public ParticipanteRecord toRecord() {
		return new ParticipanteRecord(nombre, apellido, email, telefono);
	}

	private boolean checkEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	private boolean checkPhone(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

}
