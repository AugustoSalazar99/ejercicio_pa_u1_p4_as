package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements  MatriculaService{

	@Autowired
	private PropietarioService propietarioService;
	@Autowired
	private VehiculoService vehiculoService;
	
	@Override
	public void crear(String propietario, String Vehiculo) {
		// TODO Auto-generated method stub
		
		Propietario p = this.propietarioService.seleccionar(propietario);
		Vehiculo v= this.vehiculoService.buscar(Vehiculo);
		
	}
	
	public BigDecimal valor(Vehiculo vehiculo) {
		BigDecimal valor =null;
		
		if(vehiculo.getTipo().toUpperCase().equals("MANUAL")) {
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			
		}else if(vehiculo.getTipo().toUpperCase().equals("AUTOMATICO")) {
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}
			
		
	
		
		return valor;
		
		Matricula m=new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(Propietario);
		m.setValor(valor);
		m.setVehiculo(vehiculo);
		
		
		
	}
	
	

}
