package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.dawes.modelo.UsuarioVO;

public interface UsuarioRepository extends CrudRepository<UsuarioVO, Integer> {


	UserDetails findByNombre(String nombre);


	
}
