package com.example.demo.reposities;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Producto;

public interface ProductRepositorio extends CrudRepository<Producto, Long> {
	

}

