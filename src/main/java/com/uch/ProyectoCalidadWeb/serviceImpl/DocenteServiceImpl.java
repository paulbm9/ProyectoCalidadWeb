package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Docente;
import com.uch.ProyectoCalidadWeb.repository.DocenteRepository;
import com.uch.ProyectoCalidadWeb.service.DocenteService;
@Service
public class DocenteServiceImpl implements DocenteService{

	@Autowired
	private DocenteRepository repository;
	@Override
	public List<Docente> listarTodos() {
		return repository.findAll();
	}

}
