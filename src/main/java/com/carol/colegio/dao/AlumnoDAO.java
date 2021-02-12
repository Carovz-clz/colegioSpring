package com.carol.colegio.dao;

import java.util.List;

import com.carol.colegio.dtos.AlumnoDTO;
import com.carol.colegio.entities.AlumnoEntity;

public interface AlumnoDAO {
	List<AlumnoDTO> obtenerTodosAlumnos();
	List<AlumnoDTO> obtenerAlumnosporIdyNombre(String nombre, String id);
	Integer insertarAlumno(String id, String nombre, String idMunicipio);
	Integer insertarAlumno(String id, String nombre, String idMunicipio, String famNumerosa);
	Integer actualizaralumno(String idOld, String idNew, String nombre, String idMunicipio);
	Integer actualizaralumno(String idOld, String idNew, String nombre, String idMunicipio, String famNumerosa);
	Integer eliminarAlumno(String id);
	boolean esFamiliaNumerosa(String idAlumno);
}
