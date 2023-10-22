package com.imagen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagen.entity.Usuario;
import com.imagen.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioRepository repository;
		
	@Override
	public Usuario save(Usuario user) {
		return repository.save(user);
	}

}
