package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.entity.TipoMoneda;

public interface TipoMonedaService {
	public List<TipoMoneda> listaTipoMoneda();

	public Optional<TipoMoneda> buscarTipoMoneda(int id);
}
