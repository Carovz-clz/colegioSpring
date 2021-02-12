package com.carol.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.colegio.dao.AsignaturaDAO;
import com.carol.colegio.dtos.AsignaturaDTO;
import com.carol.colegio.repositorios.AsignaturaRepository;

@Service
public class AsignaturaDAOImpl implements AsignaturaDAO {
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public List<AsignaturaDTO> obtenerAsignaturaPorIdNombreCursoTasa(Integer id, String nombre, Integer curso,
			Double tasa) {
		
		return asignaturaRepository.buscaAsignaturaPorIdNombreCursoTasa(id, nombre, curso, tasa);
	}

	@Override
	public Integer insertarAsignatura(String id, String nombre, String curso, String tasa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer actualizarAsignatura(String idOld, String idNew, String nombre, String curso, String tasa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarAsignatura(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int obtenerNumeroAsignaturasMatriculadas(String idAlumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double obtenerTasaAsignatura(String idAsignatura) {
		// TODO Auto-generated method stub
		return 0;
	}

}