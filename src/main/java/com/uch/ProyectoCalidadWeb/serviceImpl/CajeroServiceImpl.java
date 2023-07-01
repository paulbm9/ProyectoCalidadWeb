package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Cajero;
import com.uch.ProyectoCalidadWeb.repository.CajeroRepository;
import com.uch.ProyectoCalidadWeb.service.CajeroService;
@Service
public class CajeroServiceImpl implements CajeroService{
	@Autowired
	private CajeroRepository repository;
	
	@Override
	public List<Cajero> listarTodos() {
		return repository.findAll();
	}

}
