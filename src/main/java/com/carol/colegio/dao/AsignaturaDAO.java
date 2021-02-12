package com.carol.colegio.dao;

import java.util.List;

import com.carol.colegio.dtos.AsignaturaDTO;

public interface AsignaturaDAO {
	List<AsignaturaDTO> obtenerAsignaturaPorIdNombreCursoTasa(Integer id, String nombre, Integer curso, Double tasa);
	Integer insertarAsignatura(String id, String nombre, String curso, String tasa);
	Integer actualizarAsignatura(String idOld, String idNew, String nombre, String curso, String tasa);
	Integer eliminarAsignatura(String id);
	int obtenerNumeroAsignaturasMatriculadas(String idAlumno);
	double obtenerTasaAsignatura(String idAsignatura);
}
