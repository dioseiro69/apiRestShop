package com.acg.apiRestShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acg.apiRestShop.model.Articulo;
import com.acg.apiRestShop.model.Pedido;

@Repository
public interface  ArticuloRepository extends JpaRepository<Articulo, Integer>{

}
