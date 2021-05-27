package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.PedidoVO;

public interface PedidoRepository extends CrudRepository<PedidoVO, Integer> {

}
