package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.PedidoProductoUsuarioVO;

public interface PedidoProductoUsuarioRepository extends CrudRepository<PedidoProductoUsuarioVO, Integer> {


	Optional<PedidoProductoUsuarioVO> findByUsuario(int idusuario);
	 
}
