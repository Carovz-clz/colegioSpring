package com.carol.colegio.controladores;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.carol.colegio.dtos.ComboDTO;
import com.carol.colegio.entities.MunicipioEntity;
import com.carol.colegio.repositorios.MunicipioRepository;


@Controller
public class AlumnoController {
	
	@Autowired
	private MunicipioRepository municipioRepository;
	
	//private static final Logger logger = LoggerFactory.getILoggerFactory(AlumnoController.class);
	
	@GetMapping(value = "insertaralumno")
	public String formularioInsertarAlumno(ModelMap model) {
		
		Iterable<MunicipioEntity> listaEntidadesMunicipios = municipioRepository.findAll();
		List<ComboDTO> listaMunicipios = mapeoEntidadMunicipioComboDTO(listaEntidadesMunicipios);
		model.addAttribute("listaMunicipios", listaMunicipios);
		
		return "vistas/alumnos/insertarAlumnos";
		
	}
	
	private List<ComboDTO> mapeoEntidadMunicipioComboDTO(Iterable<MunicipioEntity> lista){
		List<ComboDTO> listaMunicipios = new ArrayList<ComboDTO>();
		
		for (MunicipioEntity m : lista) {
			listaMunicipios.add(new ComboDTO(m.getIdMunicipio(), m.getNombre()));
		}
		
		return listaMunicipios;
	}
	
	
}
