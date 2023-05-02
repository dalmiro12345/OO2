package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import service.Dispositivo;

public class TestPagos {

	@Test
	public void targeTaVisa() {
		// set up
		FakeRegistroDeVentas registroFalso = new FakeRegistroDeVentas();
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos, registroFalso);
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaVisa(0.03));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);
		boolean valorEsperado = true;
		// Excercise
		Factura factura = Dispositivo.generarFactura(comensal, pedido, 0.03);
		// Verify

		assertEquals(registroFalso.graboPedido(), valorEsperado);
	}

}
