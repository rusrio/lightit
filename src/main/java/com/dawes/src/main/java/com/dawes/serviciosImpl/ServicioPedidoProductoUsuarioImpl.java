package com.dawes.serviciosImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.PedidoProductoUsuarioVO;
import com.dawes.repositorio.PedidoProductoUsuarioRepository;
import com.dawes.repositorio.UsuarioRepository;
import com.dawes.servicios.ServicioPedidoProductoUsuario;

@Service
public class ServicioPedidoProductoUsuarioImpl implements ServicioPedidoProductoUsuario {
	
	@Autowired
	PedidoProductoUsuarioRepository ppur;
	
	@Autowired
	UsuarioRepository ur;

	@Override
	public <S extends PedidoProductoUsuarioVO> S save(S entity) {
		return ppur.save(entity);
	}

	@Override
	public <S extends PedidoProductoUsuarioVO> Iterable<S> saveAll(Iterable<S> entities) {
		return ppur.saveAll(entities);
	}

	@Override
	public Optional<PedidoProductoUsuarioVO> findById(Integer id) {
		return ppur.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return ppur.existsById(id);
	}

	@Override
	public Iterable<PedidoProductoUsuarioVO> findAll() {
		return ppur.findAll();
	}

	@Override
	public Iterable<PedidoProductoUsuarioVO> findAllById(Iterable<Integer> ids) {
		return ppur.findAllById(ids);
	}

	@Override
	public long count() {
		return ppur.count();
	}

	@Override
	public void deleteById(Integer id) {
		ppur.deleteById(id);
	}

	@Override
	public void delete(PedidoProductoUsuarioVO entity) {
		ppur.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends PedidoProductoUsuarioVO> entities) {
		ppur.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		ppur.deleteAll();
	}



	
	
}
