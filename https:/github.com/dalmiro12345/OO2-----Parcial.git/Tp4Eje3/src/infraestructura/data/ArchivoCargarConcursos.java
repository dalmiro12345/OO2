package infraestructura.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import domain.portsin.ConcursoRecord;
import domain.portsout.CargarConcursos;

public class ArchivoCargarConcursos implements CargarConcursos {

	private String rutaArchivo;

	public ArchivoCargarConcursos(String rutaArchivo) {
		super();
		this.rutaArchivo = rutaArchivo;
	}

	@Override
	public List<ConcursoRecord> cargarConcursosVigentes() {
		// TODO Auto-generated method stub
		List<ConcursoRecord> listaDeConcursos = new ArrayList<ConcursoRecord>();
		try {
			FileReader archivo = new FileReader(this.rutaArchivo);
			BufferedReader br = new BufferedReader(archivo);
			String linea;
			while ((linea = br.readLine()) != null) {
				linea = linea.replace(" ", "");
				String[] parts = linea.split(",");
				LocalDate fechaInicio = LocalDate.parse(parts[2], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
				LocalDate fechaFin = LocalDate.parse(parts[3], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
				if (fechaInicio.isBefore(LocalDate.now()) && fechaFin.isAfter(LocalDate.now())) {
					listaDeConcursos.add(new ConcursoRecord(parts[1], parts[0]));

				}
			}
			archivo.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new RuntimeException("Error al cargar en el archivo", e);
		}
		return listaDeConcursos;
	}

}
