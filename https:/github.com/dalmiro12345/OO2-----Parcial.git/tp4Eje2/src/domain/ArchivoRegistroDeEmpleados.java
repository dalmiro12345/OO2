package domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import domain.portsout.RegistroDeEmpleados;

public class ArchivoRegistroDeEmpleados implements RegistroDeEmpleados {

	private String rutaArchivo;

	public ArchivoRegistroDeEmpleados(String rutaArchivo) {
		super();
		this.rutaArchivo = rutaArchivo;
	}

	@Override
	public List<Empleado> listaDeEmpleados() {
		// TODO Auto-generated method stub
		List<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
		try {
			FileReader archivo = new FileReader(this.rutaArchivo);
			BufferedReader br = new BufferedReader(archivo);
			String linea;
			while ((linea = br.readLine()) != null) {
				// convirtiendolo a java.time.LocalDate
				linea = linea.replace(" ", "");
				String[] parts = linea.split(",");
				LocalDate fecha = LocalDate.parse(parts[2], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
				Empleado empleado = new Empleado(parts[0], parts[1], fecha, parts[3]);
				listaDeEmpleados.add(empleado);
			}
			archivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new RuntimeException("Error al grabar en el archivo", e);
		}
		return listaDeEmpleados;
	}

}
