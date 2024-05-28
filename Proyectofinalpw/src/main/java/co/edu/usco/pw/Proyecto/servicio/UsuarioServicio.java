package co.edu.usco.pw.Proyecto.servicio;


import org.springframework.security.core.userdetails.UserDetailsService;

import co.edu.usco.pw.Proyecto.dto.UsuarioRegistroDTO;
import co.edu.usco.pw.Proyecto.modelo.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
}
