package infraestructura.data;

import java.io.FileWriter;
import java.io.IOException;

import domain.portsout.GuardarInscripciones;
import domain.portsout.ParticipanteRecord;

public class ArchivoGuardarInscripciones implements GuardarInscripciones {

	private String rutaDelArchivo;

	public ArchivoGuardarInscripciones(String rutaDelArchivo) {
		super();
		this.rutaDelArchivo = rutaDelArchivo;
	}

	@Override
	public void grabarInscripciones(ParticipanteRecord participante, String idConcurso) {
		// TODO Auto-generated method stub
		try {
			FileWriter archivo = new FileWriter(this.rutaDelArchivo, true);
			archivo.write(participante.apellido() + ", " + participante.nombre() + ", " + participante.teléfono() + ", "
					+ idConcurso);
			archivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new RuntimeException("Error al grabar en el archivo", e);
		}

	}

}
