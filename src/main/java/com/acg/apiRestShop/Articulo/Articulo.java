package com.acg.apiRestShop.Articulo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_articulo")
	private int idArticulo;
	
	@Column(name="nombre")
	private String nombreArticulo;
	
	@Column(name="id_catalogo")
	private int idCatalogo;

	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Articulo(int idArticulo, String nombreArticulo, int idCatalogo) {
		super();
		this.idArticulo = idArticulo;
		this.nombreArticulo = nombreArticulo;
		this.idCatalogo = idCatalogo;
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

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	@Override
	public String toString() {
		return "Articulo [idArticulo=" + idArticulo + ", nombreArticulo=" + nombreArticulo + ", idCatalogo="
				+ idCatalogo + "]";
	}
	
}
