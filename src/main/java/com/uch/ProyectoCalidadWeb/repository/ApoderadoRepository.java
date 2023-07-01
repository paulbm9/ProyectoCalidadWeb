package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Apoderado;
@Repository
public interface ApoderadoRepository extends JpaRepository<Apoderado, Integer>{

}
