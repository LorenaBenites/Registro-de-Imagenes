package com.imagen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagen.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}

