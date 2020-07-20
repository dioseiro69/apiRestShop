package com.acg.apiRestShop.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acg.apiRestShop.Service.PedidoService;
import com.acg.apiRestShop.model.Pedido;
import com.acg.apiRestShop.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	@Transactional
	public List<Pedido> getPedidos() {
		
		return (List<Pedido>) pedidoRepository.findAll(); 
	}


	@Transactional
	public Pedido crearPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
		
	}



	@Transactional
	public Optional<Pedido> getPedido(Long idPedido) {
		return pedidoRepository.findById(idPedido.intValue());
	}


	@Transactional
	public String borrarPedido(Long idPedido) {
		if (pedidoRepository.findById(idPedido.intValue()).isPresent()) {
			pedidoRepository.deleteById(idPedido.intValue());
			return "Pedido eliminado correctamente";
		}
		return "El pedido introducido no existe";
	}


	@Transactional
	public Pedido updatePedido(Pedido student) {
		Pedido pedido = pedidoRepository.save(student);
		return pedido;
	}


}
