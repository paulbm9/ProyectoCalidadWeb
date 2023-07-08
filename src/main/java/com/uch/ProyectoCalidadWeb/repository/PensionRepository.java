package com.uch.ProyectoCalidadWeb.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Pension;



@Repository
public interface PensionRepository  extends JpaRepository<Pension, Integer>{ 

	
	   List<Pension> findAllByMatriculaIdmatricula(int idmatricula);
	   
	   @Transactional
	   @Modifying
	   @Query(value = "{call usp_update_pago_pension(:s_idpension)}", nativeQuery = true)
	   public void actualizarPen(@Param("s_idpension") int s_idpension);
	
}
