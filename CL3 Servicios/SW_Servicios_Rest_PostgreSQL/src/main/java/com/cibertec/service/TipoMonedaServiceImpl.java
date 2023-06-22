package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.TipoMoneda;
import com.cibertec.repository.TipoMonedaRepository;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {
	@Autowired
	private TipoMonedaRepository repository;

	@Override
	public List<TipoMoneda> listaTipoMoneda() {
		return repository.findAll();
	}
	
	@Override
	public Optional<TipoMoneda> buscarTipoMoneda(int id) {
		return repository.findById(id);
	}
}
