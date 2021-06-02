package com.dawes.controller;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dawes.modelo.ProductoVO;
import com.dawes.servicios.ServicioProducto;

@Controller
public class ProductoController {

	@Autowired
	ServicioProducto sp;
	
	@GetMapping("/tienda")
	public String tienda(Model modelo) {
		modelo.addAttribute("productos", sp.findAll());
		return "tienda";
	}
	
	@GetMapping("/gestion_productos")
	public String gestion_productos(Model modelo) {
	modelo.addAttribute("productos", sp.findAll());
	return "admin/gestion_productos";
	}
	
	 //CRUD
	@GetMapping("/insertarProducto")
	public String insertar(Model modelo) {
		modelo.addAttribute("producto", new ProductoVO());
		return "admin/insertarProducto";
	}
	
	@PostMapping("/submitProducto")
	public String submit(@ModelAttribute ProductoVO producto,Model modelo) {
		sp.save(producto);
		modelo.addAttribute("productos", sp.findAll());
		return "admin/gestion_productos";
	}
	
	@GetMapping("/eliminarProducto")
	public String eliminar(@RequestParam int idproducto, Model modelo){
		sp.deleteById(idproducto);
		modelo.addAttribute("productos", sp.findAll());
		return "admin/gestion_productos";
	}
	
	@GetMapping("/modificarProducto")
	public String modificar(@RequestParam int idproducto, Model modelo){
		ProductoVO pr=sp.findById(idproducto).get();
		modelo.addAttribute("producto", pr);
		return "admin/modificarProducto";
	}
	
}
