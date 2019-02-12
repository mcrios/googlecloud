package org.proyectosfgk.service;

import java.util.List;

import org.proyectosfgk.dao.UsuariosRepository;
import org.proyectosfgk.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

	@Autowired
	private UsuariosRepository userRepository;
	
	public List<Usuarios> findAll(){
		return (List<Usuarios>) userRepository.findAll();
	}
	
	public void insertar(Usuarios u) {
		userRepository.save(u);
	}
	
	public Usuarios findById (Integer id) {
		return userRepository.findOne(id);
	}
	
	public void deleteUser(Usuarios u) {
		userRepository.delete(u);
	}
	
	public void updateUser(Usuarios u) {
		userRepository.save(u);
	}
}
