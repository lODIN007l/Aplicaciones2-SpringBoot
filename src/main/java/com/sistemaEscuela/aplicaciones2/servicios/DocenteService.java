package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.modelo.Docente;
import com.sistemaEscuela.aplicaciones2.repositorio.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepository;
    public ArrayList<Docente> obtenerDocentes(){
        return (ArrayList<Docente>)  docenteRepository.findAll();
    }
    public Docente guardarDocente(Docente docen){
        return docenteRepository.save(docen);
    }
    public Optional<Docente> obtenerporID(Long id){
        return docenteRepository.findById(id);
    }



    public boolean EliminarDocente (Long id ){
        try {
            docenteRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }
}
