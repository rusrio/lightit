package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.PedidoVO;
import com.dawes.servicios.ServicioPedido;

@Controller
public class PedidoController {

	@Autowired
	ServicioPedido spedidos;
	
	@GetMapping("/pedidos")
	public String tienda(Model modelo) {
		modelo.addAttribute("pedidos", spedidos.findAll());
		return "/pedidos";
	}
	
	@GetMapping("/gestion_pedidos")
	public String gestion_pedidos() {
	return "admin/gestion_pedidos";
	}
	
	 //CRUD
	@GetMapping("/insertarPedidos")
	public String insertar(Model modelo) {
		modelo.addAttribute("pedidos", new PedidoVO());
		return "admin/insertarPedidos";
	}
	
	@PostMapping("/submitPedido")
	public String submit(@ModelAttribute PedidoVO pedido,Model modelo) {
		spedidos.save(pedido);
		modelo.addAttribute("pedidos", spedidos.findAll());
		return "admin/submitPedidos";
	}
	
	@GetMapping("/eliminarPedido")
	public String eliminar(@RequestParam int idpedidos, Model modelo){
		spedidos.deleteById(idpedidos);
		modelo.addAttribute("pedidos", spedidos.findAll());
		return "admin/eliminarPedidos";
			}
	
	@GetMapping("/modificarPedido")
	public String modificar(@RequestParam int idpedido, Model modelo){
		PedidoVO ped=spedidos.findById(idpedido).get();
		modelo.addAttribute("pedidos", ped);
		return "admin/modificarPedido";
	}
	
	
}
