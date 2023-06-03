package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void crear(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void borrar(String identificacion);
	public Propietario seleccionar(String identificacion);

}
