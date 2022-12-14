package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;
@Service
public class MatriculaServiceImpl  implements IMatriculaService{
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void matriucularVehiculo(String cedula, String placa) {
		
		Propietario propietario = this.propietarioRepository.busca(cedula);
		Vehiculo vehiculo = this.vehiculoRepository.buscar(placa);
		Matricula matricula = null;
		
		matricula.setFechaMatricula(LocalDateTime.now());
		
		if (vehiculo.getTipo() == "pesado") {

			
			matricula.setValorMatricula(vehiculo.getPrecio().divide(new BigDecimal(9)));
			
		}else if (vehiculo.getTipo() == "liviano") {
			matricula.setValorMatricula(vehiculo.getPrecio().divide(new BigDecimal(10)));;
			
		}
		
		//if(matricula.getValorMatricula().compareTo(new BigDecimal(2000))) {
			
		//}
		
		this.matriculaRepository.insertar(matricula);
		
		
		
		
		
	}

}
