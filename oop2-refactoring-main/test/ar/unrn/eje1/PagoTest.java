package ar.unrn.eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PagoTest {

	@Test
	public void calculoDeuda() {

		Libro elTunel = new Libro("El Túnel");
		Libro antesDelFin = new Libro("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new AlquilerRegulares(elTunelCopia, 5, 1);
		Alquiler alquilerAntesDelFin = new AlquilerRegulares(antesDelFinCopia, 3, 1);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		double valorEsperado = 10.0;
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertEquals(resultado[0], valorEsperado);
	}

	@Test
	public void calculoPuntos() {

		Libro elTunel = new Libro("El Túnel");
		Libro antesDelFin = new Libro("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new AlquilerRegulares(elTunelCopia, 5, 1);
		Alquiler alquilerAntesDelFin = new AlquilerRegulares(antesDelFinCopia, 3, 1);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		int valorEsperado = 2;
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertEquals(resultado[1], valorEsperado);
	}

}
