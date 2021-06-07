package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UsuarioRolVO;
@Repository
public interface UsuarioRolRepository extends CrudRepository<UsuarioRolVO, Integer> {

}
