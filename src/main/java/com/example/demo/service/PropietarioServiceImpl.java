package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl  implements PropietarioService{
	@Autowired
	private PropietarioService propietarioService;

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioService.crear(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioService.actualizar(propietario);
		
	}

	@Override
	public void borrar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioService.borrar(identificacion);
	}

	@Override
	public Propietario seleccionar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioService.seleccionar(identificacion);
	}

}
