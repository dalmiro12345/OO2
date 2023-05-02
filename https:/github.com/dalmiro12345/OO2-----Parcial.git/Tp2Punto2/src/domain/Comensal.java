package domain;

import java.time.LocalDateTime;
import java.util.List;

public class Comensal {

	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido;
	private Tarjeta tarjera;

	public Comensal(String nombre, String apellido, Tarjeta tarjera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjera = tarjera;
	}

	public Pedido ordenar(EMenu menu, List<ItemMenu> bebidas, List<ItemMenu> platos) {

		return menu.generarPedido(bebidas, platos);
	}

	public Factura pagar(Pedido pedido, double propina) {

		Factura factura = null;
		factura = new Factura(pedido, pedido.precioTotal(),
				this.tarjera.pagar(pedido.precioBebidas(), pedido.precioPlatos(), propina), LocalDateTime.now());
		
		return factura;

	}

}
