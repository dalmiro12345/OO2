package ar.unrn.eje3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GastosTest {

	@Test
	public void calculoDeGastos() {

		List<Gasto> gastos = new ArrayList<>(
				Arrays.asList(new GastoCena(50000, "CENA"), new GastoDesayuno(10, "DESAYUNO")));
		ReporteDeGastos reporte = new ReporteDeGastos(LocalDate.now());
		String resultado = reporte.imprimir(gastos);
		assertEquals(resultado, "Expenses"+ " "+LocalDate.now()+" "+":\n"
				+ "CENA 50000 X\n"
				+ "DESAYUNO 10"+System.lineSeparator());
		

	}

}
