package com.cibertec.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "CuentaBancaria")
public class CuentaBancaria {

	private int idCuentaBancaria;
	private int flag;
	private String numero;
	private int idBanco;
	private int idTipoMoneda;
	private int idUsuario;
}



