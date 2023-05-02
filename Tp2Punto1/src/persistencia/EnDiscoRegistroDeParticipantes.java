package persistencia;

import java.io.FileWriter;
import java.io.IOException;

import domain.RegistroDeParticipantes;

public class EnDiscoRegistroDeParticipantes implements RegistroDeParticipantes {

	private String rutaDelArchivo;

	public EnDiscoRegistroDeParticipantes(String rutaDelArchivo) {
		super();
		this.rutaDelArchivo = rutaDelArchivo;
	}

	@Override
	public void registrarParticipante(String fechaYParticipanteYConcurso) {
		// TODO Auto-generated method stub
		try {
			FileWriter archivo = new FileWriter(this.rutaDelArchivo, true);
			archivo.write(fechaYParticipanteYConcurso + "'\n");

			archivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new RuntimeException("Error al grabar en el archivo", e);
		}

	}

	

}
