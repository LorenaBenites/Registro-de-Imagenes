package com.imagen.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.imagen.entity.Producto;
import com.imagen.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepository productRepo;
	
	public void  saveProductToDB(MultipartFile img,String nompro,String descrip
			,int precio)
	{
		Producto p = new Producto();
		String fileName = StringUtils.cleanPath(img.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("no valido pendejo");
		}
		try {
			p.setImg(Base64.getEncoder().encodeToString(img.getBytes()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		p.setDescrip(descrip);
		
        p.setNompro(nompro);
        p.setPrecio(precio);
        
        productRepo.save(p);
	}
	public List<Producto> getAllProduct()
	{
		return productRepo.findAll();
	}
	

}
