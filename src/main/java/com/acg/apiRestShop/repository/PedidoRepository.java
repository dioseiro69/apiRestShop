package com.acg.apiRestShop.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acg.apiRestShop.model.Pedido;

@Repository
public interface  PedidoRepository extends CrudRepository<Pedido, Integer>{
	Void save(Optional<Pedido> pedido);
}
