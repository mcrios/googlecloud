package org.proyectosfgk.controller;

import java.util.List;

import org.proyectosfgk.model.Usuarios;
import org.proyectosfgk.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@Autowired
	private UsuariosService service;

	@GetMapping(value = "/hello")
	public String hello() {
		return "hello";
	}

//	@RequestMapping(value = "/findAllUsuarios", method = RequestMethod.GET)
//	public ModelAndView getUsuarios() {
//
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("usuarios", service.findAll());
//		mav.setViewName("index");
//		return mav;
//	}
	
	@GetMapping("/findAll")
	public List<Usuarios> findAllUsuarios(){
		return service.findAll();
	}
	
	@PostMapping("/saveUser")
	public Usuarios save(@RequestBody Usuarios u) {
		service.insertar(u);
		return u;
	}
	
	@GetMapping("/findUser/{id}")
	public Usuarios buscarUsuario(@PathVariable("id")Integer id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/deleteUser")
	public Usuarios eliminarUsuario(@RequestBody Usuarios u) {
		service.deleteUser(u);
		return service.findById(u.getId());
	}
	
	@PutMapping("/updateUser")
	public Usuarios actualizarUsuario(@RequestBody Usuarios u) {
		service.updateUser(u);
		return u;
	}
}
