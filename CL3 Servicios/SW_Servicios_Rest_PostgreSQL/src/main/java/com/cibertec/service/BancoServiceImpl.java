package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Banco;
import com.cibertec.repository.BancoRepository;

@Service
public class BancoServiceImpl implements BancoService {
	@Autowired
	private BancoRepository repository;

	@Override
	public List<Banco> listaBanco() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Banco> buscarBanco(int id) {
		return repository.findById(id);
	}
}
