package com.carol.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.colegio.dao.NotaDAO;
import com.carol.colegio.dtos.NotaDTO;
import com.carol.colegio.repositorios.NotaRepository;

@Service
public class NotaDAOImpl implements NotaDAO {

	@Autowired
	private NotaRepository notaRepository;
	
	@Override
	public List<NotaDTO> obtenerNotaPorIdNombreAsignaturaNotaFecha(Integer idAlumno, String nombre, String asignatura,
			Double nota, String fecha) {
		
		return notaRepository.obtenerNotaPorIdNombreAsignaturaNotaFecha(idAlumno, nombre, asignatura, nota, fecha);
	}

	@Override
	public List<NotaDTO> obtenerNotaPorNombreAsignaturaFecha(String nombre, String asignatura, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarNota(String idAlumno, String idAsignatura, String nota, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer actualizarNota(String idNota, String idAlumno, String idAsignatura, String nota, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarNota(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
