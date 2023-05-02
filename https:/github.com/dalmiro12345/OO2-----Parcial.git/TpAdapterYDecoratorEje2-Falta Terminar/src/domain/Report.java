package domain;

import java.io.File;
import java.io.FileWriter;

public class Report implements Export {

	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		try {
			// Exportar el reporte a un archivo.
			FileWriter archivo = new FileWriter(file, true);
			archivo.write(reporte);
			archivo.close();

		} catch (Exception ex) {
			throw new RuntimeException("Error al grabar en el archivo", ex);
		}
	}
}
