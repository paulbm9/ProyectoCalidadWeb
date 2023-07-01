package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Concepto;
@Repository
public interface ConceptoRepository  extends JpaRepository<Concepto, Integer>{

}
