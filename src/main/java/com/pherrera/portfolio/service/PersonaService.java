/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Persona;
import com.pherrera.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class PersonaService implements InterfacePersonaService{
    
        @Autowired
    public PersonaRepository persRepo;

    @Override
    public List<Persona> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarPersona(Persona per) {
        persRepo.save(per);
    }
    
}
