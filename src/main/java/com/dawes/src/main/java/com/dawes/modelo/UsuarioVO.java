package com.dawes.modelo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "usuarios")

public class UsuarioVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idusuario;
private String nombre;
private LocalDate fechaRegistro;
private String contrasena;
}
