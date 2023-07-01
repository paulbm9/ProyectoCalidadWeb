package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Concepto;
import com.uch.ProyectoCalidadWeb.repository.ConceptoRepository;
import com.uch.ProyectoCalidadWeb.service.ConceptoService;

@Service
public class ConceptoServiceImpl implements ConceptoService{

	@Autowired
	private ConceptoRepository repository;
	
	@Override
	public List<Concepto> listarTodos() {
		return repository.findAll();
	}

}
