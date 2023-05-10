/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Cursos;
import com.pherrera.portfolio.repository.CursosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class CursosService implements InterfaceCursosService {
       
        @Autowired
    public CursosRepository curRepo;

    @Override
    public List<Cursos> verCursos() {
        return curRepo.findAll();
    }

    @Override
    public void crearCursos(Cursos cur) {
        curRepo.save(cur);
    }

    @Override
    public void borrarCursos(Long id) {
        curRepo.deleteById(id);
    }

    @Override
    public Cursos buscarCursos(Long id) {
        return curRepo.findById(id).orElse(null);
    }
    
        @Override
    public void editarCursos(Cursos cur) {
        curRepo.save(cur);
    }
}
