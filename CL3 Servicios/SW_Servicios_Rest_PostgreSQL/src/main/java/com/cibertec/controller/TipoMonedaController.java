package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.TipoMoneda;
import com.cibertec.service.TipoMonedaService;

@RestController
@RequestMapping("/rest/tipomoneda")
public class TipoMonedaController {
	@Autowired
	private TipoMonedaService service;

	@GetMapping()
	public ResponseEntity<?> lista() {
		List<TipoMoneda> lstSalida = service.listaTipoMoneda();
		return ResponseEntity.ok(lstSalida);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarBanco(@PathVariable("id") int idTipoMoneda) {
		Optional<TipoMoneda> tipoMoneda = service.buscarTipoMoneda(idTipoMoneda);
		return ResponseEntity.ok(tipoMoneda);
	}
}
