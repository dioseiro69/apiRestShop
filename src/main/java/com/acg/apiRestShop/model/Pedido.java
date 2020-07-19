package com.acg.apiRestShop.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private int idPedido;
	@Column(name="nombre")
	private String nombrePedido;
	
	
	@OneToMany(mappedBy = "pedido", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JsonManagedReference
	private List<Articulo> articulos;
	
	

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public String getNombrePedido() {
		return nombrePedido;
	}


	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}


	public List<Articulo> getArticulos() {
		return articulos;
	}


	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	

	
}
