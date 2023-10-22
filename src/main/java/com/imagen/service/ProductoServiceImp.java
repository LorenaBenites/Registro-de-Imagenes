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
public class ProductoServiceImp{
	@Autowired
	private ProductoRepository productRepo;
	
	public void save(MultipartFile img,MultipartFile itec,String nompro,String descrip
			,int precio)
	{  
		Producto p = new Producto();
		
		
		 String imgFileName = StringUtils.cleanPath(img.getOriginalFilename());
		    if (imgFileName.contains("..")) {
		        System.out.println("Nombre de archivo de imagen no válido");
		    }
		    try {
		        p.setImg(Base64.getEncoder().encodeToString(img.getBytes()));
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    String itecFileName = StringUtils.cleanPath(itec.getOriginalFilename());
		    if (itecFileName.contains("..")) {
		        System.out.println("Nombre de archivo itec no válido");
		    }
		    try {
		        p.setItec(Base64.getEncoder().encodeToString(itec.getBytes()));
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		String originalFilename = itec.getOriginalFilename();
		String filenameWithoutExtension = originalFilename.replaceAll("\\.pdf$", "");
		p.setNomitec(filenameWithoutExtension);
		p.setNompro(nompro);
		p.setDescrip(descrip);   
        p.setPrecio(precio);
        
        productRepo.save(p);
	}
	
	public List<Producto> getAllProduct()
	{
		return productRepo.findAll();
	}
}
