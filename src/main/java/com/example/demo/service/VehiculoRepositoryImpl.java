package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;

public class VehiculoRepositoryImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	@Override
	public void agregar(Vehiculo vehiculo) {
		this.vehiculoRepository.insertar(vehiculo);
		
	}


}
