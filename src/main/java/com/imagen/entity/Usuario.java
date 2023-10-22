package com.imagen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name ="tb_usuario" ,uniqueConstraints =@UniqueConstraint(columnNames = "email"))
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idUsuario;
	private String email;
	private int password;
	private String rol;
	private String nombre;

}
