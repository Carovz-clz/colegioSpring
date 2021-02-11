package com.carol.colegio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.colegio.dao.ComboDAO;
import com.carol.colegio.dtos.ComboDTO;
import com.carol.colegio.entities.MunicipioEntity;
import com.carol.colegio.repositorios.MunicipioRepository;

@Service
public class ComboDAOImpl implements ComboDAO {
	
	@Autowired
	private MunicipioRepository municipioRepository;

	@Override
	public List<ComboDTO> comboMunicipios() {
		Iterable<MunicipioEntity> listaEntidadesMunicipios = municipioRepository.findAll();
		List<ComboDTO> listaMunicipios = mapeoEntidadMunicipioComboDTO(listaEntidadesMunicipios);
		return listaMunicipios;
	}

	@Override
	public List<ComboDTO> comboAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComboDTO> comboAsignaturas() {
		// TODO Auto-generated method stub
		return null;
	}

	
	private List<ComboDTO> mapeoEntidadMunicipioComboDTO(Iterable<MunicipioEntity> lista){
		List<ComboDTO> listaMunicipios = new ArrayList<ComboDTO>();
		
		for (MunicipioEntity m : lista) {
			listaMunicipios.add(new ComboDTO(m.getIdMunicipio(), m.getNombre()));
		}
		
		return listaMunicipios;
	}
}
