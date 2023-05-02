package service;

import java.util.List;

import domain.Comensal;
import domain.EMenu;
import domain.Factura;
import domain.ItemMenu;
import domain.Pedido;

public class Dispositivo {

	public static Pedido generarPedido(Comensal comensal, EMenu menu, List<ItemMenu> bebidas, List<ItemMenu> platos) {
		return comensal.ordenar(menu, bebidas, platos);
	}

	public static Factura generarFactura(Comensal comensal, Pedido pedido, double propina) {
		return comensal.pagar(pedido, propina);
	}

}
