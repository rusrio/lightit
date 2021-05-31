package com.dawes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.UsuarioVO;
import com.dawes.servicios.ServicioUsuario;

@Controller
public class UsuarioController {

	@Autowired
	ServicioUsuario susuario;
	
	@GetMapping("/usuarios")
	public String usuarios(Model modelo) {
		modelo.addAttribute("usuarios", susuario.findAll());
		return "admin/usuarios";
	}
	 //CRUD
	@GetMapping("/insertarUsuarios")
	public String insertar(Model modelo) {
		modelo.addAttribute("usuario", new UsuarioVO());
		return "admin/insertarUsuario";
	}
	
	@PostMapping("/submitUsuario")
	public String submit(@ModelAttribute UsuarioVO usuario,Model modelo) {
		susuario.save(usuario);
		modelo.addAttribute("producto", susuario.findAll());
		return "admin/submitUsuario";
	}
	
	@GetMapping("/eliminarUsuario")
	public String eliminar(@RequestParam int idusuario, Model modelo){
		susuario.deleteById(idusuario);
		modelo.addAttribute("lineas", susuario.findAll());
		return "admin/eliminarUsuario";
	}
	
	@GetMapping("/modificarUsuario")
	public String modificar(@RequestParam int idusuario, Model modelo){
		UsuarioVO usu=susuario.findById(idusuario).get();
		modelo.addAttribute("usuario", usu);
		return "admin/modificarUsuario";
	}
	
}
