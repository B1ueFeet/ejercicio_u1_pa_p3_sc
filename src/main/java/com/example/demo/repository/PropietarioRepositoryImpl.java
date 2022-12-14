package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	private static List<Propietario> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		this.baseDatos.add(propietario);
		
	}

	@Override
	public Propietario busca(String cedula) {
		Propietario pr = null;
		for(Propietario prop: baseDatos) {
			if (prop.getCedula() == cedula) {
				pr = prop;
			}
		}
		return pr;
	}

}
