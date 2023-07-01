package com.uch.ProyectoCalidadWeb.service;

import java.util.List;
import java.util.Optional;


import com.uch.ProyectoCalidadWeb.model.Apoderado;
public interface ApoderadoService {
	public List<Apoderado>listartodos();
	public void guardar(Apoderado apo);
	public void borrar(int id);
	public Optional<Apoderado>buscarId(int id);
}
