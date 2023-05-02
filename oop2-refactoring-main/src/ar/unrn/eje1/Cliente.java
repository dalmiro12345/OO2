package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	@SuppressWarnings("unused")
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
	}

	private double calcularDeuda() {
		double resultado = 0;
		for (Alquiler alquiler : alquileres) {
			resultado += alquiler.costo();
		}
		return resultado;
	}

	private int calcularPuntos() {
		int resultado = 0;
		for (Alquiler alquiler : alquileres) {
			resultado += alquiler.puntos();
		}
		return resultado;
	}

	Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		resultado[0] = this.calcularDeuda();
		resultado[1] = this.calcularPuntos();
		return resultado;
	}

	// agregar array de obhtos

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}
}