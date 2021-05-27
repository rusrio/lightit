package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.ProductoVO;

public interface ProductoRepository extends CrudRepository<ProductoVO, Integer> {

}
