package com.acg.apiRestShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_articulo")
	private int idArticulo;
	@Column(name="articulo")
	private String nombreArticulo;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_pedido")
	@JsonBackReference
	private Pedido pedido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_catalogo")
	@JsonBackReference
	private Catalogo catalogo;
	
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdArticulo() {
		return idArticulo;
	}


	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}


	public String getNombreArticulo() {
		return nombreArticulo;
	}


	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}


	public Catalogo getCatalogo() {
		return catalogo;
	}


	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
