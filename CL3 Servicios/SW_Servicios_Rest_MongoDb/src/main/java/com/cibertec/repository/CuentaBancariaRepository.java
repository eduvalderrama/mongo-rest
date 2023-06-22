package com.cibertec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cibertec.entity.CuentaBancaria;

public interface CuentaBancariaRepository extends MongoRepository<CuentaBancaria, Integer>{

}
