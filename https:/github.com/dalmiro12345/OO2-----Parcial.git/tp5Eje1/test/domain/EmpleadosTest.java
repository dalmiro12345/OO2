package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EmpleadosTest {

	@Test
	public void salarioTestMandoMedio() {
		Empleados regular1 = new EmpleadoRegular(200);
		Empleados regular2 = new EmpleadoRegular(300);
		Empleados LiderDeProyecto = new EmpleadoConGenteACargo(700, Arrays.asList(regular1, regular2));
		Empleados mandoMedio = new EmpleadoConGenteACargo(900, Arrays.asList(LiderDeProyecto));
		int resultadoEsperado = 2100;
		assertEquals(mandoMedio.salario(), resultadoEsperado);
	}

	@Test
	public void salarioTestGerente() {
		Empleados regular1 = new EmpleadoRegular(200);
		Empleados regular2 = new EmpleadoRegular(300);
		Empleados LiderDeProyecto = new EmpleadoConGenteACargo(700, Arrays.asList(regular1, regular2));
		Empleados mandoMedio = new EmpleadoConGenteACargo(900, Arrays.asList(LiderDeProyecto));
		Empleados gerente = new EmpleadoConGenteACargo(1000, Arrays.asList(mandoMedio));
		Empleados director = new EmpleadoConGenteACargo(2000, Arrays.asList(gerente));

		int resultadoEsperado = 5100;
		assertEquals(director.salario(), resultadoEsperado);
	}

}
