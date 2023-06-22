package com.cibertec.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cibertec.entity.Banco;
import com.cibertec.entity.CuentaBancaria;
import com.cibertec.entity.TipoMoneda;

import lombok.extern.apachecommons.CommonsLog;

@RestController
@RequestMapping("/rest/busqueda")
@CommonsLog
public class BusquedaController {

	//PostgreSQL
	String URL_BANCO = "http://localhost:8091/rest/banco";
	String URL_TIPOMONEDA = "http://localhost:8091/rest/tipomoneda";
	
	//MongoDB
	String URL_CUENTABANCARIA = "http://localhost:8093/rest/cuentabancaria";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/cuentasbancarias")
	public ResponseEntity<?> lista() {
	    ResponseEntity<List<CuentaBancaria>> responseCuentaBancaria = restTemplate.exchange(URL_CUENTABANCARIA, HttpMethod.GET, null, new ParameterizedTypeReference<List<CuentaBancaria>>() {});
	    List<CuentaBancaria> lstCuentaBancaria = responseCuentaBancaria.getBody();

	    List<Map<String, Object>> lstMapCuentaBancaria = new ArrayList<>();

	    for (CuentaBancaria objCuentaBancaria : lstCuentaBancaria) {
	        ResponseEntity<Banco> responseBanco = restTemplate.exchange(URL_BANCO + "/" + objCuentaBancaria.getIdBanco(), HttpMethod.GET, null, new ParameterizedTypeReference<Banco>() {});
	        Banco banco = responseBanco.getBody();
	        ResponseEntity<TipoMoneda> responseTipoMoneda = restTemplate.exchange(URL_TIPOMONEDA + "/" + objCuentaBancaria.getIdTipoMoneda(), HttpMethod.GET, null, new ParameterizedTypeReference<TipoMoneda>() {});
	        TipoMoneda tipoMoneda = responseTipoMoneda.getBody();

	        Map<String, Object> mapCuentaBancaria = new LinkedHashMap<>();
	        mapCuentaBancaria.put("idCuentaBancaria", objCuentaBancaria.getIdCuentaBancaria());
	        mapCuentaBancaria.put("flag", objCuentaBancaria.getFlag());
	        mapCuentaBancaria.put("numero", objCuentaBancaria.getNumero());
	        mapCuentaBancaria.put("banco", banco);
	        mapCuentaBancaria.put("tipoMoneda", tipoMoneda);
	        mapCuentaBancaria.put("idUsuario", objCuentaBancaria.getIdUsuario());

	        lstMapCuentaBancaria.add(mapCuentaBancaria);
	    }

	    return ResponseEntity.ok(lstMapCuentaBancaria);
	}
}
