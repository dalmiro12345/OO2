package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestHorasTrabajadas {

	@Test
	public void tiempoSinSpike() {

		ItemDeTrabajo tarea1 = new TareaAnalisis(10);
		ItemDeTrabajo tarea2 = new TareaAnalisis(20);
		ItemDeTrabajo historia = new HistoriaDeUsuario(Arrays.asList(tarea1, tarea2), 40);
		int resultadoEsperado = 70;
		assertEquals(historia.tiempoDeTrabajo(), resultadoEsperado);

	}

	@Test
	public void tiempoConSpike() {

		ItemDeTrabajo tarea1 = new TareaAnalisis(10);
		ItemDeTrabajo tarea2 = new TareaAnalisis(20);
		ItemDeTrabajo spike = new Spike(60);
		ItemDeTrabajo historia = new HistoriaDeUsuario(Arrays.asList(tarea1, tarea2,spike), 40);
		int resultadoEsperado = 130;
		assertEquals(historia.tiempoDeTrabajo(), resultadoEsperado);

	}

}
