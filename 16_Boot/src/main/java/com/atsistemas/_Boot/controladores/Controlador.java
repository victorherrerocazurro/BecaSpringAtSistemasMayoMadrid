package com.atsistemas._Boot.controladores;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.atsistemas._Boot.entidades.Genero;
import com.atsistemas._Boot.entidades.Persona;
import com.atsistemas._Boot.servicios.Servicio;
import com.atsistemas._Boot.vistas.PedroView;

@Controller
@RequestMapping("/Persona")
@SessionAttributes({ "generos" })
public class Controlador {

	private Servicio servicio;

	@Autowired
	public Controlador(Servicio servicio) {
		super();
		this.servicio = servicio;
	}

	@ModelAttribute("generos")
	public String[] initGeneros() {
		return new String[] { Genero.Hombre.name(), Genero.Mujer.name() };
	}

	@RequestMapping(path = "/Alta.html", method = RequestMethod.GET)
	public String inicializadorFormularioAltaPersona(Model model) {
		model.addAttribute("persona", new Persona());
		// TODO Crear la vista formularioAlta
		return "formularioAlta";
	}

	@RequestMapping(path = "/Alta.html", method = RequestMethod.POST)
	public String procesarAltaPersona(@ModelAttribute Persona persona, Model model) {

		servicio.guardarPersona(persona);
		model.addAttribute("mensaje", "Se ha producido el alta correcta");

		return "formularioAlta";
	}

	// Identificador de View
	@RequestMapping("/Baja.html")
	public String procesarBajaUsuario(Model model) {
		return null;
	}

	// ../Usuario/Actualizar.html?id=12
	@RequestMapping("/Actualizar.html")
	public View procesarActualziarUsuario(@RequestParam int id) {
		
		//TODO crear vista "/WEB-INF/Views/actualizar.jsp"
		return new PedroView("/WEB-INF/classes/templates/actualizar.jsp");
	}

	// Persona/Consultar.html/pepe GET -> Consulta por nombre con nombre = pepe
	@RequestMapping("/Consultar.html/{nombre}")
	public ModelAndView procesarConsultarUsuario(@PathVariable String nombre) {
		Persona persona = servicio.consultarPersonaPorNombre(nombre);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		
		model.put("persona", persona);
		
		//TODO crear vista exito
		return new ModelAndView("exito", model);
	}
}
