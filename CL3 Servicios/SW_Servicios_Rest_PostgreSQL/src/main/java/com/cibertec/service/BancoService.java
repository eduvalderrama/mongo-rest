package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.entity.Banco;

public interface BancoService {
	public List<Banco> listaBanco();

	public Optional<Banco> buscarBanco(int id);
}
