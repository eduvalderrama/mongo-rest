package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Banco;
import com.cibertec.service.BancoService;

@RestController
@RequestMapping("/rest/banco")
public class BancoController {
	@Autowired
	private BancoService service;

	@GetMapping()
	public ResponseEntity<?> lista() {
		List<Banco> lstSalida = service.listaBanco();
		return ResponseEntity.ok(lstSalida);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarBanco(@PathVariable("id") int idBanco) {
		Optional<Banco> banco = service.buscarBanco(idBanco);
		return ResponseEntity.ok(banco);
	}
}
