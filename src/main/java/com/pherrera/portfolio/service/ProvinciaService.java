/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Provincia;
import com.pherrera.portfolio.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class ProvinciaService implements InterfaceProvinciaService {
        @Autowired
    public ProvinciaRepository provRepo;

    @Override
    public List<Provincia> verProvincia() {
        return provRepo.findAll();
    }

    @Override
    public void crearProvincia(Provincia prov) {
        provRepo.save(prov);
    }

    @Override
    public void borrarProvincia(Long id) {
        provRepo.deleteById(id);
    }

    @Override
    public Provincia buscarProvincia(Long id) {
        return provRepo.findById(id).orElse(null);
    }
    
        @Override
    public void editarProvincia(Provincia prov) {
        provRepo.save(prov);
    }
    
}
