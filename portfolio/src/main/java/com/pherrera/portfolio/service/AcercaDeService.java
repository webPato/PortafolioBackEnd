/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.AcercaDe;
import com.pherrera.portfolio.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class AcercaDeService implements InterfaceAcercadeService {
    
            @Autowired
    public AcercaDeRepository acerRepo;

     @Override
    public List<AcercaDe> verAcercaDe() {
        return acerRepo.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe ac) {
        acerRepo.save(ac);
    }

    @Override
    public void borrarAcercaDe(Long id) {
        acerRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acerRepo.findById(id).orElse(null);
    }
        @Override
    public void editarAcercaDe(AcercaDe acd) {
        acerRepo.save(acd);
    }
    
}
