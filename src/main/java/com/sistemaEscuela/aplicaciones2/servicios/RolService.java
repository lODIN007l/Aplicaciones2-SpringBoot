package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.enums.RolNombre;
import com.sistemaEscuela.aplicaciones2.modelo.Rol;
import com.sistemaEscuela.aplicaciones2.repositorio.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        System.out.println("Esto devuelve: " + rolRepository.findByRolNombre(rolNombre));
        return rolRepository.findByRolNombre(rolNombre);
    }

    public boolean existsByRolNombre(RolNombre rolNombre){
        return rolRepository.existsByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
