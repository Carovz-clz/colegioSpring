package com.carol.colegio.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carol.colegio.dao.NotaDAO;
import com.carol.colegio.repositorios.NotaRepository;


@Controller
public class NotaController {
	
	@Autowired
	private NotaDAO notaImpl;
	
	//Listado alumnos
	@GetMapping(value = "listadonotas")
	public String FormularioListadoNotas() {
		return "vistas/notas/listadoNotas";
	}
	
	@PostMapping(value = "listadonotas")
	public String listarNotasPorIdAlumnoNombreAsignaturaNotaFecha(
			@RequestParam(value = "id", required = false) Integer idAlumno,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "asignatura") String asignatura,
			@RequestParam(value = "nota", required = false) Double nota,
			@RequestParam(value = "fehca", required = false) String fecha,
			ModelMap model){		
		
		model.addAttribute("lista", notaImpl.obtenerNotaPorIdNombreAsignaturaNotaFecha(idAlumno, nombre, asignatura, nota, fecha));
		return "vistas/notas/listadoNotas";
	}
	
}
