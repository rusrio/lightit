package com.dawes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
}
