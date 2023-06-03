package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

	private static List<Matricula> baseD= new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseD.add(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}


	

}
