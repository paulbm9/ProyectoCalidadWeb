package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{

}
