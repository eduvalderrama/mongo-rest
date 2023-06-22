package com.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_banco")
public class Banco {

	@Id
	@Column(name = "idBanco")
	private int idBanco;

	@Column(name = "flag")
	private int flag;
	
	@Column(name = "nombre")
	private String nombre;

}
