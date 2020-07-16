package com.acg.apiRestShop.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acg.apiRestShop.Articulo.Articulo;
import com.acg.apiRestShop.DAO.ArticuloDAO;

@Repository
public class ArticuloDAOImpl implements ArticuloDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Articulo> getArticulos() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Articulo> theQuery = currentSession.createQuery("from Articulo", Articulo.class);
		
		List<Articulo> articulos = theQuery.getResultList();
		
		return articulos;
	}

}
