package com.carol.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.colegio.dao.AlumnoDAO;
import com.carol.colegio.dtos.AlumnoDTO;
import com.carol.colegio.entities.AlumnoEntity;
import com.carol.colegio.repositorios.AlumnoRepository;

@Service
public class AlumnoDAOImpl implements AlumnoDAO {
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public List<AlumnoDTO> obtenerAlumnosporIdyNombre(Integer id, String nombre) {
		return alumnoRepository.buscaAlumnoporIDyNombre(id, nombre);
	}

	@Override
	public Integer insertarAlumno(Integer id, String nombre, Integer idMunicipio, Integer famNumerosa) {
		
		famNumerosa = (famNumerosa == null) ? 0 : 1;		
		AlumnoEntity alumno = new AlumnoEntity(id, nombre, idMunicipio, famNumerosa);		
		alumnoRepository.save(alumno);
		
		return 1;  
	}

	@Override
	public Integer actualizaralumno(String idOld, String idNew, String nombre, String idMunicipio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer actualizaralumno(String idOld, String idNew, String nombre, String idMunicipio, String famNumerosa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarAlumno(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean esFamiliaNumerosa(String idAlumno) {
		// TODO Auto-generated method stub
		return false;
	}



	

	
}