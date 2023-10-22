package com.imagen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idprod;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private String img;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private String itec;
	@Column(length = 100)
	private String nomitec;
	@Column(length = 50)
	private String nompro;
	private double precio;
	@Column(length = 100)
	private String descrip;
	
}
