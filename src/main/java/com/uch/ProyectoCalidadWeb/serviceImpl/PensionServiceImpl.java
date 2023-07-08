package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Pension;
import com.uch.ProyectoCalidadWeb.repository.PensionRepository;
import com.uch.ProyectoCalidadWeb.service.PensionService;




@Service
public class PensionServiceImpl implements PensionService {
	
	@Autowired
	private PensionRepository repository;

	@Override
	public List<Pension> buscarPorIdMatricula(int idmatricula) {
	    return repository.findAllByMatriculaIdmatricula(idmatricula);
	}

	@Override
	public void updatePen(int idpension) {
		repository.actualizarPen(idpension);
	}

}
