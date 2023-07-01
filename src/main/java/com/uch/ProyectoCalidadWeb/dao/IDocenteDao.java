package com.uch.ProyectoCalidadWeb.dao;

import java.util.List;

import com.uch.ProyectoCalidadWeb.model.Docente;

public interface IDocenteDao {

	public List<Docente>findAll();
	
	public int guardar(Docente doc);
	
	public Docente findById(long id);
	
	public int borrar(long id);
	
	public int actualizar(Docente doc);
}
