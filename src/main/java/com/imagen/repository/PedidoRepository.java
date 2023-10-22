package com.imagen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagen.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
