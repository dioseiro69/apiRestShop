package com.acg.apiRestShop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acg.apiRestShop.model.Pedido;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer>{
	Void save(Optional<Pedido> pedido);
}
