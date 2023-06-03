package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	public void crear(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(String placa);
	public Vehiculo buscar(String placa);

}
