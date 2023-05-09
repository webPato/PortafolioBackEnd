/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Direccion;
import com.pherrera.portfolio.repository.DireccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class DireccionService implements InterfaceDireccionService {
         @Autowired
    public DireccionRepository dirRepo;

    @Override
    public List<Direccion> verDireccion() {
        return dirRepo.findAll();
    }

    @Override
    public void crearDireccion(Direccion dir) {
        dirRepo.save(dir);
    }

    @Override
    public void borrarDireccion(Long id) {
        dirRepo.deleteById(id);
    }

    @Override
    public Direccion buscarDireccion(Long id) {
        return dirRepo.findById(id).orElse(null);
    }
    
        @Override
    public void editarDireccion(Direccion dir) {
        dirRepo.save(dir);
    }
    
}
