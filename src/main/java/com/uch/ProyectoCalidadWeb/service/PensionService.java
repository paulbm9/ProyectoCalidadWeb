package com.uch.ProyectoCalidadWeb.service;

import java.util.List;

import com.uch.ProyectoCalidadWeb.model.Pension;



public interface PensionService {
	 public List<Pension> buscarPorIdMatricula(int idmatricula);
}
