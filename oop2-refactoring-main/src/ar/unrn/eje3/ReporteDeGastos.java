package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

	private LocalDate fecha;

	public ReporteDeGastos(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public String imprimir(List<Gasto> gastos) {

		StringBuffer cadena = new StringBuffer("");

		cadena.append("Expenses " + this.fecha + " :" + "\n");

		for (Gasto gasto : gastos) {
			cadena.append(gasto.obtenerGasto());
			
		}

		return cadena.toString();
	}
}
