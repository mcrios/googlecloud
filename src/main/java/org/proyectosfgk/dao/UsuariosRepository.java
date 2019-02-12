package org.proyectosfgk.dao;

import org.proyectosfgk.model.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer>  {

}
