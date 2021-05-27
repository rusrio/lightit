package com.dawes.serviciosImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.PedidoVO;
import com.dawes.repositorio.PedidoRepository;
import com.dawes.servicios.ServicioProducto;

@Service
public class ServicioProductoImpl implements ServicioProducto {

	@Autowired
	PedidoRepository pr;

	@Override
	public <S extends PedidoVO> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public <S extends PedidoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return pr.saveAll(entities);
	}

	@Override
	public Optional<PedidoVO> findById(Integer id) {
		return pr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return pr.existsById(id);
	}

	@Override
	public Iterable<PedidoVO> findAll() {
		return pr.findAll();
	}

	@Override
	public Iterable<PedidoVO> findAllById(Iterable<Integer> ids) {
		return pr.findAllById(ids);
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(Integer id) {
		pr.deleteById(id);
	}

	@Override
	public void delete(PedidoVO entity) {
		pr.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends PedidoVO> entities) {
		pr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		pr.deleteAll();
	}
	
	
}
