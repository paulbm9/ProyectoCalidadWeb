package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Matricula;
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{

}
