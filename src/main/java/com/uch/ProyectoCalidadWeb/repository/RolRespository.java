package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Rol;

@Repository
public interface RolRespository extends JpaRepository<Rol, Long>{

	public Rol findByRolname(String rolname);
}
