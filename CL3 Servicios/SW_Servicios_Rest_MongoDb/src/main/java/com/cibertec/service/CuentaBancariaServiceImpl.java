package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.CuentaBancaria;
import com.cibertec.repository.CuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

	@Autowired
	private CuentaBancariaRepository repository;

	@Override
	public List<CuentaBancaria> listaCuentaBancaria() {
		return repository.findAll();
	}
}


