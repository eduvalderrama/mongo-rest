package com.cibertec.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CuentaBancaria {
	private int idCuentaBancaria;
	private int flag;
	private String numero;
	private int idBanco;
	private int idTipoMoneda;
	private Banco banco;
    private TipoMoneda tipoMoneda;
	private int idUsuario;
}



