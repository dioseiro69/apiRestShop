package com.acg.apiRestShop.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;
import com.acg.apiRestShop.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	@Override
	public List<Pedido> getPedidos() {
		
		return pedidoRepository.findAll(); 
	}


}
