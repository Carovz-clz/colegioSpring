package com.carol.colegio.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carol.colegio.dtos.NotaDTO;

public interface NotaDAO {
	List<NotaDTO> obtenerNotaPorIdNombreAsignaturaNotaFecha(Integer idAlumno, String nombre, String asignatura, Double nota, String fecha); 
	List<NotaDTO> obtenerNotaPorNombreAsignaturaFecha(String nombre, String asignatura, String fecha); 
	Integer insertarNota(Integer idAlumno, Integer idAsignatura, Double nota, String fecha);
	Integer actualizarNota(String idNota, String idAlumno, String idAsignatura, String nota, String fecha);
	Integer eliminarNota(String id);
}
