package com.acg.apiRestShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;

@RestController
@RequestMapping("/servicio1")
public class ArticuloRestController {

	@Autowired
	private PedidoService articuloService;
	
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
	http://127.0.0.1:8080/apibbdd/articulos*/
	@GetMapping("/pedidos")
	public List<Pedido> findAll(){
		//retornará todos los usuarios
		return articuloService.getPedidos();
	}
	
}
