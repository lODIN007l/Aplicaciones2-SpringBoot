package com.sistemaEscuela.aplicaciones2.repositorio;


import com.sistemaEscuela.aplicaciones2.enums.RolNombre;
import com.sistemaEscuela.aplicaciones2.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    boolean existsByRolNombre(@NotNull RolNombre rolNombre);
    Optional<Rol> findByRolNombre(@NotNull RolNombre rolNombre);
}

