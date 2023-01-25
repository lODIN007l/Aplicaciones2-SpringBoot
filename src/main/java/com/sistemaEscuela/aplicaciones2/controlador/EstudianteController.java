package com.sistemaEscuela.aplicaciones2.controlador;

import com.sistemaEscuela.aplicaciones2.modelo.Estudiante;
import com.sistemaEscuela.aplicaciones2.servicios.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estuServi;

    @PreAuthorize("hasRole('ESTUDIANTE')")
    @GetMapping()
    public ArrayList<Estudiante> obEstudiantes(){
        return estuServi.obtenerEstudiantes();
    }

    @PostMapping()
    public Estudiante guardarEstudiante(@RequestBody Estudiante estu){
        return this.estuServi.guardarEstudiante(estu);
    }
    @GetMapping(path = "/{id}" )
    public Optional<Estudiante> obtenerEstudianteID (@PathVariable("id") Long id){
        return this.estuServi.obtenerporID(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporID (@PathVariable("id") Long id){
        boolean ok = this.estuServi.EliminarEstudiante(id);
        if(ok){
            return "Estudiante Eliminado Correctamente";

        }else{
            return "No se ha encontrado al estudiante";
        }
    }
}
