package com.acg.apiRestShop.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acg.apiRestShop.Service.ArticuloService;
import com.acg.apiRestShop.model.Articulo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/servicio2")
public class ArticuloRestController {

	@Autowired
	private ArticuloService articuloService;
	
	
	@ApiOperation(value = "getArticuloById", notes = "Retorna un artículo al recibir el id de un artículo como parámetro")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK")})
	@GetMapping("/articulo/{id}")
	public Optional<Articulo> getArticuloById(@PathVariable(value = "id") Long idArticulo){
		return articuloService.getArticulo(idArticulo);
	}
	
	
}
