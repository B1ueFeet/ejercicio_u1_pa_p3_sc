package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo vehiculo );
	public Vehiculo buscar(String placa);
	

}
