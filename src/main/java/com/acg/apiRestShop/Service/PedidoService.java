package com.acg.apiRestShop.Service;

import java.util.List;
import java.util.Optional;

import com.acg.apiRestShop.model.Pedido;

public interface PedidoService {
	
	public List<Pedido> getPedidos();
	public Optional<Pedido> getPedido(Long idPedido);
	public void crearPedido(Pedido pedido);
	public String borrarPedido(Long idPedido);
	public String updatePedido(Pedido pedido);
}
