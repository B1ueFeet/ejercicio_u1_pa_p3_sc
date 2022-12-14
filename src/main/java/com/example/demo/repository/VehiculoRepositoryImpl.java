package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	private static List<Vehiculo> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		this.baseDatos.add(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		Vehiculo  vh = null;
		for(Vehiculo vehi: baseDatos) {
			if (vehi.getPlaca() == placa) {
				vh = vehi;
			}
		}
		return vh;
	}

}
