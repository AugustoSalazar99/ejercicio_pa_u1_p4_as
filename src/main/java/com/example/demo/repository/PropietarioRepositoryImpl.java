package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	private static List<Propietario> baseD= new ArrayList<>();
	
	@Override
	public void insertar(Propietario propietario) {
		
		baseD.add(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		Propietario tmp = null;
		for (Propietario propietario2 : baseD) {
			if (propietario2.getIdentificacion().equals(propietario)){
				propietario2=tmp;
				
			}
		}
		baseD.add(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario ptmp=null;
		for (Propietario propietario : baseD) {
			if (propietario.getIdentificacion().equals(identificacion)){
				propietario=ptmp;
			}
		}
		baseD.remove(ptmp);
		baseD.add(ptmp);
	}

	@Override
	public Propietario seleccionar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario tmp=null;
		for (Propietario propietario : baseD) {
			if (propietario.getIdentificacion().equals(identificacion)) {
				propietario=tmp;
			}
		}
		return tmp;
	}

}
