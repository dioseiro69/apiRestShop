package com.acg.apiRestShop.controller;

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

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/servicio1")
public class PedidoRestController {

	@Autowired
	private PedidoService articuloService;
	
	
	@ApiOperation(value = "Is Alive operation", notes = "Return is the microservice is alive with a get operation returning the time")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@GetMapping("/pedidos")
	public List<Pedido> getPedidos(){
		//retornará todos los usuarios
		return articuloService.getPedidos();
	}
	
	@GetMapping("/pedido/{id}")
	public Optional<Pedido> getPedidoById(@PathVariable(value = "id") Long employeeId){
		return articuloService.getPedido(employeeId);
	}
	
	
	@RequestMapping(value = "/pedido/guardar", method = RequestMethod.POST, produces = "application/json")
    public void guardarPedido(@RequestBody Pedido pedido){
          articuloService.crearPedido(pedido);
    }
	
	@RequestMapping(value = "/pedido/borrar/{id}", method = RequestMethod.GET, produces = "application/json")
	public String borrarPedido(@PathVariable Long id) {
		return articuloService.borrarPedido(id);
	}
	
	@RequestMapping(value = "/pedido/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updatePedido(Pedido pedido) {
		return articuloService.updatePedido(pedido);
	}
	
}
