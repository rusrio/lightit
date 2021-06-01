package com.dawes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioRolController {

	@GetMapping("/gestion_usuarios")
	public String gestion_usuarios() {
	return "admin/gestion_usuarios";
	}
	
	@GetMapping("/creacionadmin")
	public String creacionadmin() {
	return "admin/creacionadmin";
	}
	
}
