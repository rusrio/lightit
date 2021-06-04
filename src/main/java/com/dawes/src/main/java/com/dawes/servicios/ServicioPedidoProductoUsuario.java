package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.PedidoProductoUsuarioVO;
import com.dawes.modelo.UsuarioVO;


public interface ServicioPedidoProductoUsuario {

	<S extends PedidoProductoUsuarioVO> S save(S entity);

	<S extends PedidoProductoUsuarioVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<PedidoProductoUsuarioVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<PedidoProductoUsuarioVO> findAll();

	Iterable<PedidoProductoUsuarioVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(PedidoProductoUsuarioVO entity);

	void deleteAll(Iterable<? extends PedidoProductoUsuarioVO> entities);

	void deleteAll();

}