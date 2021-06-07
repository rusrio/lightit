package com.dawes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioRolVO;
import com.dawes.servicios.ServicioUsuarioRol;

@Controller
public class UsuarioRolController {

	
	@Autowired
	ServicioUsuarioRol sur;
	
	@GetMapping("/gestion_usuarios")
	public String gestion_usuarios(Model modelo) {
		modelo.addAttribute("usuarioroles", sur.findAll());
	return "admin/gestion_usuarios";
	}
	

	@GetMapping("/creacionadmin")
	public String creacionadmin() {
	return "admin/creacionadmin";
	}
	
	@GetMapping("/insertarUsuariorol")
	public String insertar(Model modelo) {
		modelo.addAttribute("usuariorol", new UsuarioRolVO());
		return "admin/insertarProducto";
	}
	
	@PostMapping("/submitUsuariorol")
	public String submit(@ModelAttribute UsuarioRolVO usuariorol,Model modelo) {
		sur.save(usuariorol);
		modelo.addAttribute("usuariorol", sur.findAll());
		return "admin/gestion_usuarios";
	}
	
	@GetMapping("/eliminarUsuarioRol")
	public String eliminar(@RequestParam int idproducto, Model modelo){
		sur.deleteById(idproducto);
		modelo.addAttribute("usuariorol", sur.findAll());
		return "admin/gestion_usuarios";
	}
	
	
}
