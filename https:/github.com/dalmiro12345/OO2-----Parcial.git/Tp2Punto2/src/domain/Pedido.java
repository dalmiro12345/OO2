package domain;

import java.util.List;

public class Pedido {

	private List<ItemMenu> bebidas;
	private List<ItemMenu> platos;

	public Pedido(List<ItemMenu> bebidas, List<ItemMenu> platos) {
		super();
		this.bebidas = bebidas;
		this.platos = platos;
	}

	double precioTotal() {
		return this.precioBebidas() + this.precioPlatos();
	}

	double precioBebidas() {
		double precio = 0;
		for (ItemMenu i : this.bebidas) {
			precio = precio + i.precio();
		}
		return precio;
	}

	double precioPlatos() {
		double precio = 0;
		for (ItemMenu i : this.platos) {
			precio = precio + i.precio();
		}
		return precio;
	}

}
