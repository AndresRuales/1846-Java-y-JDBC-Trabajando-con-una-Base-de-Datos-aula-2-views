package com.alura.jdbc.modelo;


//representacion de la tabla
public class Producto {
	
	
	private Integer id;
	private String descripcion;
	private String nombre;
	private Integer cantidad;
	
	
	public Producto(String nombre, String descripcion, Integer cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getNombre() {
		return nombre;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setId(int id) {
		this.id = id;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("{id: %s, nombre: %s, descripcion: %s, cantidad: %d", 
				this.id,
				this.nombre,
				this.descripcion,
				this.cantidad);
	}
	

}
