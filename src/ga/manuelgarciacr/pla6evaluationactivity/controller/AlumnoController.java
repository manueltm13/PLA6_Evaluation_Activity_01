package ga.manuelgarciacr.pla6evaluationactivity.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ga.manuelgarciacr.pla6evaluationactivity.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	@RequestMapping("/form")
	public String verForm(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "alumno-form";
	}

	@RequestMapping("/procesar")
	public String procesarForm(@Valid @ModelAttribute("alumno") Alumno alumno, 
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "alumno-form";
		} else {
			return "alumno-view";
		}
	}
}
