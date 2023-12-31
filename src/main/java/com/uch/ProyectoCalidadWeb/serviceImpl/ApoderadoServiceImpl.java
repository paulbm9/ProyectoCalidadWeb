package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Apoderado;
import com.uch.ProyectoCalidadWeb.repository.ApoderadoRepository;
import com.uch.ProyectoCalidadWeb.service.ApoderadoService;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{
	@Autowired
	private ApoderadoRepository repository;
	
	@Override
	public List<Apoderado> listartodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Apoderado apo) {
		repository.save(apo);
		
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Apoderado> buscarId(int id) {
		return repository.findById(id);
	}

}
