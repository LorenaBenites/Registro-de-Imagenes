package com.imagen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagen.entity.Pedido;
import com.imagen.repository.PedidoRepository;

@Service
public class PedidoServiceImp implements PedidoService{
	
	@Autowired
	private PedidoRepository repository;
	
	@Override
	public Pedido save(Pedido ped) {
		return repository.save(ped);
	}
	
	
}
