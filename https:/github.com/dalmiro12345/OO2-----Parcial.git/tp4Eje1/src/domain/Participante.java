package domain;

public class Participante {

	private String nombre;
	private String telefono;
	private String region;

	public Participante(String nombre, String telefono, String region) {
		super();
		if (nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("Debe cargar un nombre");
		}
		this.nombre = nombre;
		if (telefono == null || telefono.isEmpty()) {
			throw new RuntimeException("Debe cargar un nombre");
		}
		if (!telefono.matches("\\d{4}-\\d{6}")) {
			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
		}

		this.telefono = telefono;
		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
			throw new RuntimeException("Region desconocida. Las conocidas son: China, US, Europa");
		}
		this.region = region;
	}

	public String nombre() {
		return nombre;
	}

	public String telefono() {
		return telefono;
	}

	public String region() {
		return region;
	}
	
	

}
