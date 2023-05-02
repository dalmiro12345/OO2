package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestPaquetesDeSeguro {

	@Test
	public void costoSinPaquetes() {
		Paquete seguro1 = new Seguro(30, "Hogar");
		Paquete seguro2 = new Seguro(10, "Automovil");
		Paquete seguro3 = new Seguro(40, "Vida");
		Paquete seguro4 = new Seguro(20, "Medicos");
		Paquete paquete1 = new PaqueteSeguro(Arrays.asList(seguro1, seguro2, seguro3, seguro4));
		double valorEsperado = 95;
		double resultado = paquete1.costo();
		assertEquals(resultado, valorEsperado);

	}

	@Test
	public void costoConPaquetes() {
		// Creo el Paquete 1
		Paquete seguro1 = new Seguro(30, "Hogar");
		Paquete seguro2 = new Seguro(10, "Automovil");
		Paquete seguro3 = new Seguro(40, "Vida");
		Paquete seguro4 = new Seguro(20, "Medicos");
		List<Paquete> listaP1 = new ArrayList<Paquete>(Arrays.asList(seguro1, seguro2, seguro3, seguro4));
		Paquete paquete1 = new PaqueteSeguro(listaP1);
		// Creo el paquete 2 y le agregro el paquete 1
		Paquete seguro5 = new Seguro(60, "Hogar");
		Paquete seguro6 = new Seguro(70, "Automovil");
		List<Paquete> listaP2 = new ArrayList<Paquete>(Arrays.asList(seguro5, seguro6));
		Paquete paquete2 = new PaqueteSeguro(listaP2);
			paquete2.addPaquete(paquete1);
		double valorEsperado = 218.5;
	
		double resultado = paquete2.costo();
		assertEquals(resultado, valorEsperado);

	}

}
