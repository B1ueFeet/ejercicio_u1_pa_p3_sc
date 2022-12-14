package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3ScApplication {
	
	@Autowired
	private static IPropietarioRepository propietarioRepository;
	
	@Autowired
	private static IVehiculoService iVehiculoService;
	
	@Autowired
	private static IMatriculaService matriculaService;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3ScApplication.class, args);
		
		Vehiculo vehiculo = null;
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("PDC-9930");
		vehiculo.setPrecio(new BigDecimal(39900));
		vehiculo.setTipo("pesado");
		
		iVehiculoService.agregar(vehiculo);
		
		Propietario propietario = null;
		propietario.setApellido("Castillo");
		propietario.setNombre("Serghy");
		propietario.setCedula("17171844466");
		propietario.setFechaNacimiento(LocalDateTime.now());
		
		propietarioRepository.insertar(propietario);
		
		matriculaService.matriucularVehiculo(propietario.getCedula(), vehiculo.getPlaca());
		
	}

	
}
