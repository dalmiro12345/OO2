package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculadorTest {

	@Test
	public void calcularJubiladoEnPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().minusMonths(1).getMonthValue(),new LogTransaction());
		double valorEsperado = 220;
		double resultado = calculador.calcularPrecio(200);
		assertEquals(resultado, valorEsperado);

	}

	@Test
	public void calcularJubiladoSinPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue(),new LogTransaction());
		double valorEsperado = 200;
		double resultado = calculador.calcularPrecio(200);
		assertEquals(resultado, valorEsperado);

	}

	@Test
	public void calcularNoJubiladoEnPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue(),new LogTransaction());
		double valorEsperado = 230;
		double resultado = calculador.calcularPrecio(200);
		assertEquals(resultado, valorEsperado);

	}

	@Test
	public void calcularNoJubiladoSinPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().minusMonths(1).getMonthValue(),new LogTransaction());
		double valorEsperado = 242;
		double resultado = calculador.calcularPrecio(200);
		assertEquals(resultado, valorEsperado);

	}

}
