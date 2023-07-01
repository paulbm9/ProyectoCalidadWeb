package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Cajero;

@Repository
public interface CajeroRepository extends JpaRepository<Cajero, Integer>{

}
