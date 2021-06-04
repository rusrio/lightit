package com.dawes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "pedidoproductousuario")
public class PedidoProductoUsuarioVO{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproductousuario;
	
	@ManyToOne
	@JoinColumn(name = "idpedido")
	private PedidoVO pedido;
	
	@ManyToOne
	@JoinColumn(name = "idproducto")
	private ProductoVO producto;
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private UsuarioVO usuario;

}
