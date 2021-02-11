package com.carol.colegio.controladores;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carol.colegio.dao.ComboDAO;
import com.carol.colegio.entities.AlumnoEntity;
import com.carol.colegio.repositorios.AlumnoRepository;

@Controller
public class AlumnoController {
	
	@Autowired
	private ComboDAO combo;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	//private static final Logger logger = LoggerFactory.getILoggerFactory(AlumnoController.class);
	
	@GetMapping(value = "insertaralumno")
	public String formularioInsertarAlumno(ModelMap model) {
		model.addAttribute("listaMunicipios", combo.comboMunicipios());
		
		return "vistas/alumnos/insertarAlumnos";		
	}
	
	@PostMapping(value = "insertaralumno")
	public String InsertarAlumno(@RequestParam(value = "id", required = false) Integer id, 
			@RequestParam(value = "nombre") String nombre, @RequestParam(value = "municipios") Integer idMunicipio,
			@RequestParam(value = "familiaNumerosa", required = false) Integer familiaNumerosa, 
			ModelMap model){
		
		familiaNumerosa = (familiaNumerosa == null) ? 0 : 1;
		
		AlumnoEntity alumno = new AlumnoEntity(id, nombre, idMunicipio, familiaNumerosa);
		
		alumnoRepository.save(alumno);
		
		model.addAttribute("listaMunicipios", combo.comboMunicipios());
		
		return "vistas/alumnos/insertarAlumnos";	
		
	}
	
	
	
}
