package com.imagen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.imagen.entity.Usuario;
import com.imagen.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/verUsuario")
	public String verRegistro() {
		return ("registroUsuario");
	}
	
	@GetMapping("/verLogin")
	public String verlogin() {
		return ("login");
	}
	
	@PostMapping("/registrarUsuario")
	public String registrarUsuario(Usuario user ){
		service.save(user);
		return "registroUsuario";		
	}
	
	
}
