package com.imagen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.imagen.entity.Pedido;
import com.imagen.service.PedidoService;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping(value="/verPedido")
	public String verPedido() {
		return"registroPedidos";
	}
	
	@PostMapping("/registroPedido")
	public String registroPedido(Pedido ped) {
		
		service.save(ped);
		
		return "lorena";
	}
}
