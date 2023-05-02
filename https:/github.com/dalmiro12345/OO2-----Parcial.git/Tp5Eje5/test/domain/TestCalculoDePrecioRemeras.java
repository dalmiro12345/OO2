package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculoDePrecioRemeras {

	@Test
	public void remerasNacionales() {
		Remeras nacional = new Nacionales(200);
		double valorEsperado = 138.55;
		double valorObtenido = nacional.calcularPrecioRemera();
		assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void remerasImportadas() {
		Remeras nacional = new Importadas(200);
		double valorEsperado = 162;
		double valorObtenido = nacional.calcularPrecioRemera();
		assertEquals(valorObtenido, valorEsperado);
	}

}
