package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

public class Propietario {

	private String name;
	private String apellido;
	private String identificacion;
	private LocalDateTime fechaNacimiento;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Propietario [name=" + name + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
