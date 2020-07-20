package com.acg.apiRestShop.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;

@SpringBootTest
class PedidoServiceTests {

	
	@Autowired
	private PedidoService pedidoService;
	
	@Test
	public void getPedidos() {
		List<Pedido> pedidos = pedidoService.getPedidos();
		assertNotNull(pedidos);
	}
	
	@Test
	public void getPedido() {
		Optional<Pedido> pedido = pedidoService.getPedido(1L);
		assertNotNull(pedido);
	}
}
