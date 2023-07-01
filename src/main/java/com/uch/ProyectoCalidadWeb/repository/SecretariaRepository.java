package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Secretaria;

@Repository
public interface SecretariaRepository extends JpaRepository<Secretaria, Integer>{

}
