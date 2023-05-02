package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import domain.RegistroDeVentas;

public class EnDiscoRegistroDeVentas implements RegistroDeVentas {

	private String rutaDelArchivo;

	public EnDiscoRegistroDeVentas(String rutaDelArchivo) {
		super();
		this.rutaDelArchivo = rutaDelArchivo;
	}

	@Override
	public void registrarVentas(double montoInicial, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		try {
			FileWriter archivo = new FileWriter(this.rutaDelArchivo, true);
			archivo.write(fecha.toString() + " | " + montoInicial + "'\n");
			archivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new RuntimeException("Error al grabar en el archivo", e);
		}
	}

}
