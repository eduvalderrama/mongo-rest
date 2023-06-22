package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.CuentaBancaria;
import com.cibertec.service.CuentaBancariaService;

@RestController
@RequestMapping("/rest/cuentabancaria")
public class CuentaBancariaController {

	@Autowired
	private CuentaBancariaService service;
	
	@GetMapping()
	public ResponseEntity<?>  lista(){
		List<CuentaBancaria> lstSalida = service.listaCuentaBancaria();
		return ResponseEntity.ok(lstSalida);
	}
}






