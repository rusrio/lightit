package com.dawes.modelo;

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
@Table(name = "productos")
public class ProductoVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idproducto;
private String nombre;
private String descripcion;
private String titulo;
private Date fecha;
private double precio;
}
