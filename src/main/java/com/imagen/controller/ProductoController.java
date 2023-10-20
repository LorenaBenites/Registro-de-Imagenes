package com.imagen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.imagen.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productService; 
	
	@GetMapping(value = "/verImagenes")
	public String verImg() {
		
		return "registrodeImg";
	}
	
	@PostMapping("/addP")
	public String saveProduct(@RequestParam("img") MultipartFile img, @RequestParam("nompro") String name,
			@RequestParam("precio") int precio, @RequestParam("descrip") String descrip) {
		productService.saveProductToDB(img, name, descrip, precio);
		return "redirect:/verImagenes";
	}
}
	
