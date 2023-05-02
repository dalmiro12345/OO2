package domain;

import java.time.LocalDateTime;
import java.util.List;

public class EMenu {

	private List<ItemMenu> bebidas;
	private List<ItemMenu> platos;
	private RegistroDeVentas registro;

	public EMenu(List<ItemMenu> bebidas, List<ItemMenu> platos, RegistroDeVentas registro) {
		super();
		this.bebidas = bebidas;
		this.platos = platos;
		this.registro = registro;
	}

	Pedido generarPedido(List<ItemMenu> bebidas, List<ItemMenu> platos) {
		Pedido pedido = null;
		pedido = new Pedido(bebidas, platos);
		this.registro.registrarVentas(pedido.precioTotal(), LocalDateTime.now());
		return pedido;
	}

}
