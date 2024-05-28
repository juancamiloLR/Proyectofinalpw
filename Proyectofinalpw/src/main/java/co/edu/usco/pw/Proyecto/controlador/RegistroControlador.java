package co.edu.usco.pw.Proyecto.controlador;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroControlador {

	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio() {
		return "index";
	}
	
	 @GetMapping("/derecho")
     public String derecho() {
	    return "derecho";
}

@GetMapping("/ingenieriasoftware")
public String ingenieriasoftware() {
	return "ingenieriasoftware";
}
@GetMapping("/lenguasextranjeras")
public String lenguasextranjeras() {
	return "lenguasextranjeras";
}
@GetMapping("/medicina")
public String medicina() {
	return "medicina";
}

@GetMapping("/psicologia")
public String psicologia() {
	return "psicologia";
}

@GetMapping("/sobrenosotros")
public String sobrenosotros() {
	return "sobrenosotros";
}
	
}
