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
@Table(name = "tb_tipo_moneda")
public class TipoMoneda {

	@Id
	@Column(name = "idTipoMoneda")
	private int idTipoMoneda;

	@Column(name = "flag")
	private int flag;
	
	@Column(name = "descripcion")
	private String descripcion;

}
