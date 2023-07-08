package com.uch.ProyectoCalidadWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.uch.ProyectoCalidadWeb.model.Pension;
import com.uch.ProyectoCalidadWeb.service.PensionService;


@Controller
public class ControllerPension {
	
	
	@Autowired
	private PensionService servicePension;
	
	
	@GetMapping("/listadoPensiones/{id}")
    public String listadoP(@PathVariable int id, Model modelo) {
        List<Pension> lista = servicePension.buscarPorIdMatricula(id);
        modelo.addAttribute("listaPensiones", lista);
        System.out.println(lista);
        return "listadoPensiones";
    }
}
