package com.acg.apiRestShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acg.apiRestShop.Articulo.Articulo;
import com.acg.apiRestShop.Service.ArticuloService;

@RestController
@RequestMapping("/servicio1")
public class ArticuloRestController {

	@Autowired
	private ArticuloService articuloService;
	
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
	http://127.0.0.1:8080/apibbdd/articulos*/
	@GetMapping("/articulos")
	public List<Articulo> findAll(){
		//retornará todos los usuarios
		return articuloService.getArticulos();
	}
}
