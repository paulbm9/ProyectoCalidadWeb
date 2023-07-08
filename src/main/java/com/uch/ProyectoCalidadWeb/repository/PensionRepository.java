package com.uch.ProyectoCalidadWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Pension;



@Repository
public interface PensionRepository  extends JpaRepository<Pension, Integer>{ 

	
	   List<Pension> findAllByMatriculaIdmatricula(int idmatricula);
	   
	
	
}
