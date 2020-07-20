package com.acg.apiRestShop.Service;

import java.util.Optional;

import com.acg.apiRestShop.model.Articulo;

public interface ArticuloService {
	
	public Optional<Articulo> getArticulo(Long idArticulo);
}
