package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	private static List<Matricula> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		
		
	}
	

}
