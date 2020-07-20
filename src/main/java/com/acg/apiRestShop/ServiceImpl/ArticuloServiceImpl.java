package com.acg.apiRestShop.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acg.apiRestShop.Service.ArticuloService;
import com.acg.apiRestShop.model.Articulo;
import com.acg.apiRestShop.repository.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;
	

	@Transactional
	public Optional<Articulo> getArticulo(Long idArticulo) {
		return articuloRepository.findById(idArticulo.intValue());
	}



}
