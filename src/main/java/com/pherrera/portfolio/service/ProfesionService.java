/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Profesion;
import com.pherrera.portfolio.repository.ProfesionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class ProfesionService implements InterfaceProfesionService {
    
        @Autowired
    public ProfesionRepository proRepo;

    @Override
    public List<Profesion> verProfesion() {
        return proRepo.findAll();
    }

    @Override
    public void crearProfesion(Profesion prof) {
        proRepo.save(prof);
    }

    @Override
    public void borrarProfesion(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Profesion buscarProfesion(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
        @Override
    public void editarProfesion(Profesion pro) {
        proRepo.save(pro);
    }
}
