package com.acg.apiRestShop.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/servicio1")
public class PedidoRestController {

	@Autowired
	private PedidoService pedidoService;
	
	
	@ApiOperation(value = "getPedidos", notes = "Retorna una lista de pedidos con los artículos que contiene")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@GetMapping("/pedidos")
	public List<Pedido> getPedidos(){
		//retornará todos los pedidos
		return pedidoService.getPedidos();
	}
	
	@ApiOperation(value = "getPedidoById", notes = "Retorna un pedido en concreto con los artículos que contiene mediante el parámetro id de entrada")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@GetMapping("/pedido/{id}")
	public Optional<Pedido> getPedidoById(@PathVariable(value = "id") Long pedidoId){
		return pedidoService.getPedido(pedidoId);
	}
	
	
	@ApiOperation(value = "crearPedido", notes = "Crea un pedido mediante un JSON de entrada")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@PostMapping(consumes = "application/json" , produces = "application/json")
	public ResponseEntity<Object> crearPedido(@RequestBody Pedido pedido) {
		Pedido pedidoGuardado = pedidoService.crearPedido(pedido);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(pedidoGuardado.getIdPedido()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@ApiOperation(value = "borrarPedido", notes = "Borra un pedido mediante su id")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@RequestMapping(value = "/pedido/borrar/{id}", method = RequestMethod.GET, produces = "application/json")
	public String borrarPedido(@PathVariable Long id) {
		return pedidoService.borrarPedido(id);
	}
	
	@ApiOperation(value = "updatePedido", notes = "Actualiza un pedido existente")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@RequestMapping(value = "/pedido/update", method = RequestMethod.PATCH, produces = "application/json")
	public Pedido updatePedido(Pedido pedido) {
		return pedidoService.updatePedido(pedido);
	}
	
}
