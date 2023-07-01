package com.uch.ProyectoCalidadWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uch.ProyectoCalidadWeb.model.Estudiante;
import com.uch.ProyectoCalidadWeb.model.Matricula;
import com.uch.ProyectoCalidadWeb.model.Usuario;
import com.uch.ProyectoCalidadWeb.service.EstudianteService;
import com.uch.ProyectoCalidadWeb.service.MatriculaService;
import com.uch.ProyectoCalidadWeb.service.UsuarioService;


@Controller
public class ControllerIndex {
	
	@GetMapping({"/","/login"})
	public String login() {
		return "autenticar";
	}

	@Autowired
	private MatriculaService servicematricula;
	
	
	@Autowired
	private EstudianteService serviceestudiante;
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping("/menu")
	public String menu(Model model) {
	    List<Matricula> listaMatricula = servicematricula.listarTodos();
	    List<Estudiante> listaEstudiante = serviceestudiante.listarTodos();
	    List<Usuario> listaUsuarios = service.listAll();		
	    
	    model.addAttribute("listaMatricula", listaMatricula);
	    model.addAttribute("listaEstudiante", listaEstudiante);
	    model.addAttribute("listaUsuarios", listaUsuarios);
	    
	    return "principal";
	}
	
}
