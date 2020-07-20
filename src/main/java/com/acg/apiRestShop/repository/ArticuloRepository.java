package com.acg.apiRestShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acg.apiRestShop.model.Articulo;

@Repository
public interface  ArticuloRepository extends CrudRepository<Articulo, Integer>{
}
