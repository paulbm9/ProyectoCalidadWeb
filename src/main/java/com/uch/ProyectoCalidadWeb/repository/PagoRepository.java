package com.uch.ProyectoCalidadWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.ProyectoCalidadWeb.model.Pago;
@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer>{

}
