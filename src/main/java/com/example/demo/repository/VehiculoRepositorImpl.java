package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositorImpl implements VehiculoRepository {

	private static List<Vehiculo> baseD= new ArrayList<>();
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		
			baseD.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vtm = null;
		for (Vehiculo vehiculo1 : baseD) {
			if (vehiculo1.getPlaca().equals(vehiculo)) {
				vehiculo1=vtm;
				
			}
			
		}
		baseD.add(vehiculo);
	
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo =null;
		for (Vehiculo v : baseD) {
			if (v.getPlaca().equals(placa)) {
				
				vehiculo=v;
				
			}
			
		}
		 baseD.remove(vehiculo);
		 baseD.add(vehiculo);
	}

	@Override
	public Vehiculo seleccionar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vtmp =null;
		for (Vehiculo vehiculo : baseD) {
			if (vehiculo.getPlaca().equals(placa)) {
				vehiculo=vtmp;
			}
		}
		return vtmp;
		
	}

}
