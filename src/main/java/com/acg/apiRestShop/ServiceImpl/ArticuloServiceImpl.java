package com.acg.apiRestShop.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acg.apiRestShop.Articulo.Articulo;
import com.acg.apiRestShop.DAO.ArticuloDAO;
import com.acg.apiRestShop.Service.ArticuloService;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	private ArticuloDAO articuloDAO;
	
	@Override
	public List<Articulo> getArticulos() {
		
		return articuloDAO.getArticulos();
	}

}
