package com.acg.apiRestShop.ServiceImpl;

import java.util.List;
import java.util.Optional;

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


	@Override
	public void crearPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
		
	}



	@Override
	public Optional<Pedido> getPedido(Long idPedido) {
		return pedidoRepository.findById(idPedido.intValue());
	}


	@Override
	public String borrarPedido(Long idPedido) {
		if (pedidoRepository.findById(idPedido.intValue()).isPresent()) {
			pedidoRepository.deleteById(idPedido.intValue());
			return "Pedido eliminado correctamente";
		}
		return "El pedido introducido no existe";
	}


	@Override
	public String updatePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}



}
