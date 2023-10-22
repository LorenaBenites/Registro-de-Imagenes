package com.imagen.service;

import org.springframework.web.multipart.MultipartFile;

public interface ProductoServices {

	public abstract void save(MultipartFile img,MultipartFile itec ,String nomitec,String nompro,String descrip
			,int precio);
}
