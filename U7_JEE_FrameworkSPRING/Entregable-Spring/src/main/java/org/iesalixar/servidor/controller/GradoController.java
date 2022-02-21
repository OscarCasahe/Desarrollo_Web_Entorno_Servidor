package org.iesalixar.servidor.controller;

import java.util.Optional;

import org.iesalixar.servidor.dto.AsignaturaDTO;
import org.iesalixar.servidor.dto.GradoDTO;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.services.GradoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/grados")
public class GradoController {

	@Autowired
	GradoServiceImpl gradoService;

	
	@GetMapping("") 
	public String asignaturas(Model model) {
		
		model.addAttribute("grados", gradoService.getAllGrados());
		
		return "grados";
	}
	
	
	@GetMapping("/asignaturas")
	public String asignaturasAlumnos(@RequestParam(required=false,name="codigo") String codigo,Model model) {
		
		//Obtengo el parámetro de la URL (en caso de no esta vuelvo a la lista de asignaturas
		if (codigo==null) {
			return "redirect:/grados";
		}
		
		Optional<Grado> grado = gradoService.findGradoById(Long.parseLong(codigo));
		model.addAttribute("grado",grado.get());				
		return "asignaturasGrado";
	}
	
	@GetMapping("/addGrado")
	public String addDepartmentGet(@RequestParam(required=false,name="error") String error,
			@RequestParam(required=false,name="grado") String nombre,
			Model model) {
		
		GradoDTO grado = new GradoDTO();
		
		model.addAttribute("grado", grado);
		model.addAttribute("error", error);
		model.addAttribute("previo", nombre);
		return "addGrado";
	}
	
	
	@PostMapping("/addGrado")
	public String addGradoPost(@ModelAttribute GradoDTO grado,Model model) {
		
		Grado gradoBD = new Grado();
		gradoBD.setNombre(grado.getNombre());
		
		if (gradoService.insertarGrado(gradoBD)==null) {
			return "redirect:/grados/addGrado?error=Existe&grado="+grado.getNombre();
		}
		
		return "redirect:/grados";
	}
	
	
	
	@GetMapping("/addasignatura")
	public String addAsignaturaGet(@RequestParam(required=false,name="error") String error,
			@RequestParam(required=false,name="asignatura") String nombre,
			Model model) {
		
		AsignaturaDTO asignatura = new AsignaturaDTO();
		
		model.addAttribute("asignatura", asignatura);
		model.addAttribute("error", error);
		model.addAttribute("previo", nombre);
		return "addAsignatura";
	}
	
	
	@PostMapping("/addasignatura")
	public String addDepartmentPost(@ModelAttribute GradoDTO asignatura,Model model) {
		
		Asignatura asignaturaBD = new Asignatura();
		asignaturaBD.setNombre(asignatura.getNombre());
		
		if (gradoService.insertarAsignatura(asignaturaBD)==null) {
			return "redirect:/addasignatura?error=Existe&grado="+asignatura.getNombre();
		}
		
		return "redirect:/grados";
	}
	
}
