package com.uch.ProyectoCalidadWeb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.ProyectoCalidadWeb.model.Pago;
import com.uch.ProyectoCalidadWeb.repository.PagoRepository;
import com.uch.ProyectoCalidadWeb.service.PagoService;

@Service
public class PagoServiceImpl implements PagoService{
	@Autowired
	private PagoRepository repository;
	
	@Override
	public List<Pago> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Pago pago) {
		repository.save(pago);
		
	}

	@Override
	public Optional<Pago> buscarId(long id) {
		return repository.findById((int) id);
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
		
	}

}
