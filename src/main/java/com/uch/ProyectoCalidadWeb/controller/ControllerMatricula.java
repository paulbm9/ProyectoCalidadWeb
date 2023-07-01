package com.uch.ProyectoCalidadWeb.controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uch.ProyectoCalidadWeb.model.Matricula;
import com.uch.ProyectoCalidadWeb.model.Pago;
import com.uch.ProyectoCalidadWeb.model.Salon;
import com.uch.ProyectoCalidadWeb.model.Secretaria;
import com.uch.ProyectoCalidadWeb.repository.MatriculaRepository;
import com.uch.ProyectoCalidadWeb.service.MatriculaService;
import com.uch.ProyectoCalidadWeb.service.PagoService;
import com.uch.ProyectoCalidadWeb.service.SalonService;
import com.uch.ProyectoCalidadWeb.service.SecretariaService;

@Controller
public class ControllerMatricula {

	@Autowired
	private PagoService servicepago;
	
	@Autowired
	private SalonService servicesalon;
	
	@Autowired
	private SecretariaService servicesecretaria;
	
	@Autowired
	private MatriculaService servicematricula;
	
	@GetMapping("/Matriculas")
	public String index(Model modelo) {
		List<Matricula>lista = servicematricula.listarTodos();
		modelo.addAttribute("listaMatricula", lista);
		return "listarmatriculas";
	}
	
	@GetMapping("/matricula")
	public String index1(Model model) {
	    List<Matricula> listaMatricula = servicematricula.listarTodos();
	    model.addAttribute("listaMatricula", listaMatricula);
	    return "principal";
	}
	
	@GetMapping("/nuevaMat")
	public String nuevo(Model modelo) {
		List<Pago>listapago = servicepago.listarTodos();
		List<Salon>listasalon = servicesalon.listarTodos();
		List<Secretaria>listasecretaria = servicesecretaria.listarTodos();
		modelo.addAttribute("matricula", new Matricula());
		modelo.addAttribute("listaPago", listapago);
		modelo.addAttribute("listaSecretaria", listasecretaria);
		modelo.addAttribute("listaSalon", listasalon);
		return "nuevoMatricula";
	}
	
	@PostMapping("/guardarMat")
	public String guardar(@ModelAttribute Matricula matricula) {
		servicematricula.guardar(matricula);
		return "redirect:/Matriculas";
	}
	
	@RequestMapping("/imprimirMat/{id}")
	public String imprimirMat(@PathVariable("id") Long id,Map<String,Object> model,Model model2) {
		Optional<Matricula> matri=null;
		List<Matricula>matricula=new ArrayList<>();
		if(id>0) {
			matri=servicematricula.encontrarId(id);
			for(Matricula m:servicematricula.listarTodos()) {
				if(m.getIdmatricula()==id) {
					matricula.add(m);
				}
			}
		}
		model.put("matri", matri);
		model2.addAttribute("listaMatri", matricula);
		model2.addAttribute("java8Instant", Instant.now());
		return "imprimirmatricula";
	}
}
