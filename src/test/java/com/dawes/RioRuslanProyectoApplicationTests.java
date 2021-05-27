package com.dawes;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.modelo.PedidoVO;
import com.dawes.modelo.UsuarioPedidoVO;
import com.dawes.modelo.UsuarioVO;
import com.dawes.servicios.ServicioPedido;
import com.dawes.servicios.ServicioPedidoProducto;
import com.dawes.servicios.ServicioProducto;
import com.dawes.servicios.ServicioRol;
import com.dawes.servicios.ServicioUsuario;
import com.dawes.servicios.ServicioUsuarioPedido;
import com.dawes.servicios.ServicioUsuarioProducto;
import com.dawes.serviciosImpl.ServicioUsuarioRol;

@SpringBootTest
class RioRuslanProyectoApplicationTests {

	@Autowired
	ServicioPedido sp;
	
	@Autowired
	ServicioPedidoProducto sppr;
	
	@Autowired
	ServicioProducto spr;
	
	@Autowired
	ServicioRol sr;
	
	@Autowired
	ServicioUsuario su;
	
	@Autowired
	ServicioUsuarioPedido sup;
	
	@Autowired
	ServicioUsuarioProducto supr;
	
	@Autowired
	ServicioUsuarioRol sur;
	
	@Test
	@Order(1)
	public void registrarUsuario() {
		su.save(new UsuarioVO(0, "Ruslan", LocalDate.now(),"1234"));
		su.save(new UsuarioVO(0, "María", LocalDate.now(),"4321"));
	}
	/*
	@Test
	@Order(2)
	public void crearPedido() {
		sp.save(new PedidoVO(0,10));
		sup.save(new UsuarioPedidoVO(0,su.findByNombre("Ruslan").get(),sp.findById(0),LocalDate.now()));	
	}
	*/
	@Test
	@Order(3)
	public void asignarRol() {
		
	}

}
