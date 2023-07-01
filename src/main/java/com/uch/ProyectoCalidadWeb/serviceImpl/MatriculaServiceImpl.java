package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Matricula;
import com.uch.ProyectoCalidadWeb.repository.MatriculaRepository;
import com.uch.ProyectoCalidadWeb.service.MatriculaService;
@Service
public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public List<Matricula> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Matricula matricula) {
		repository.save(matricula);
	}

	@Override
	public Optional<Matricula> encontrarId(long id) {
		return repository.findById((int) id);
	}

}
