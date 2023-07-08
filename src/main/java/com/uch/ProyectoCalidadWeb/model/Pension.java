package com.uch.ProyectoCalidadWeb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pension")
public class Pension {
	
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_pension")
	    public int id_pension;

	   @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "idmatricula")
	    public Matricula matricula;
	    
	  
	
	@Column
	public Date fecha_vencimiento;
	
	@Column
	public Date fecha_operacion;
	
	@Column
	public double monto;
	
	@Column
	public String estado;
	
	
	
	

	

}
