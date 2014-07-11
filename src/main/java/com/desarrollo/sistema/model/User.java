package com.desarrollo.sistema.model;

public class User {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
