package com.imagen.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.imagen.entity.Producto;
import com.imagen.service.ProductoServiceImp;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoServiceImp productService; 
	
	
	@GetMapping(value = "/verImagenes")
	public String verImg() {
		
		return "registrodeImg";
	}

	@GetMapping("/verListado")
	public String showExampleView(Model model)
	{
		List<Producto> products = productService.getAllProduct();
		model.addAttribute("products", products);
		return "listadoProducto";
	}
	 
	
	@PostMapping("/addP")
	public String saveProduct(@RequestParam("img") MultipartFile img,@RequestParam("itec") MultipartFile itec, @RequestParam("nompro") String nompro,
			@RequestParam("precio") int precio, @RequestParam("descrip") String descrip) {
		productService.save(img,itec,nompro,descrip, precio);
		
		return "redirect:/verListado";
	}
	
	

}
	
