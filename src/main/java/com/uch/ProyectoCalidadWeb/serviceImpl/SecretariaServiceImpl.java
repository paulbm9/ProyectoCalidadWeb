package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Secretaria;
import com.uch.ProyectoCalidadWeb.repository.SecretariaRepository;
import com.uch.ProyectoCalidadWeb.service.SecretariaService;
@Service
public class SecretariaServiceImpl implements SecretariaService{
	@Autowired
	private SecretariaRepository repository;
	@Override
	public List<Secretaria> listarTodos() {
		return repository.findAll();
	}

}
