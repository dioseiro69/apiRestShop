package com.acg.apiRestShop.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.acg.apiRestShop.Service.ArticuloService;
import com.acg.apiRestShop.model.Articulo;

@SpringBootTest
class ArticuloServiceTest {

	
	@Autowired
	private ArticuloService articuloService;
	
	
	@Test
	public void getArticulo() {
		Optional<Articulo> articulo = articuloService.getArticulo(1L);
		assertNotNull(articulo);
	}
}
