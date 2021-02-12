package com.carol.colegio.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carol.colegio.dao.AsignaturaDAO;

@Controller
public class AsignaturaController {
	
	@Autowired
	private AsignaturaDAO asignatura;
	
	@GetMapping(value = "listadoasignaturas")
	public String listarAsignaturas() {
		return "vistas/asignaturas/listadoAsignaturas";
	}
	
	@PostMapping(value = "listadoasignaturas")
	public String listarAlumnos(
			@RequestParam(value = "id", required = false) Integer id , 
			@RequestParam(value = "nombre") String nombre, 
			@RequestParam(value = "curso", required = false) Integer curso,
			@RequestParam(value = "tasa", required = false) Double tasa,
			ModelMap model) {
		
		
		model.addAttribute("lista", asignatura.obtenerAsignaturaPorIdNombreCursoTasa(id, nombre, curso, tasa));
		return "vistas/alumnos/listadoAlumnos";
	}
}
