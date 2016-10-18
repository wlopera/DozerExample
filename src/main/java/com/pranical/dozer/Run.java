package com.pranical.dozer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;


import com.pranical.domain.Factura;
import com.pranical.domain.Persona;
import com.pranical.domain.PersonaDTO;

public class Run {

	// Cambio para mi segundo comit !!!!
	// Tercer commit
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Julio");
		persona.setApelido("Garmendia");
		persona.setEdad(25);
		persona.setFecha("16/10/2016");
		
		Factura factura = new Factura();
		factura.setId(123);
		factura.setConcepto("Nexus5");
		factura.setImporte(400.0);
		persona.setFactura(factura);
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<String> lista = new ArrayList<String>();
		lista.add("dozerMapping.xml");
		mapper.setMappingFiles(lista);
		
		PersonaDTO personaDTO = mapper.map(persona, PersonaDTO.class, "en");
		System.out.println("Persona: "+ persona);
		System.out.println("PersonaDTO: "+ personaDTO);
		
		persona.setFecha("10/16/2016");
		personaDTO = mapper.map(persona, PersonaDTO.class, "fr");
		System.out.println("Persona: "+ persona);
		System.out.println("PersonaDTO: "+ personaDTO);
		
	}

}
