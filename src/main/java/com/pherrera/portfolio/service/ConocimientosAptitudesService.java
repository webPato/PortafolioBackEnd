/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.ConocimientosAptitudes;
import com.pherrera.portfolio.repository.ConocimientosAptitudesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class ConocimientosAptitudesService implements InterfaceConocimientosAptitudesService {
         @Autowired
    public ConocimientosAptitudesRepository conapRepo;

    @Override
    public List<ConocimientosAptitudes> verConocimientosAptitudes() {
        return conapRepo.findAll();
    }

    @Override
    public void crearConocimientosAptitudes(ConocimientosAptitudes con) {
        conapRepo.save(con);
    }

    @Override
    public void borrarConocimientosAptitudes(Long id) {
        conapRepo.deleteById(id);
    }

    @Override
    public ConocimientosAptitudes buscarConocimientosAptitudes(Long id) {
        return conapRepo.findById(id).orElse(null);
    }
        @Override
    public void editarConocimientosAptitudes(ConocimientosAptitudes con) {
        conapRepo.save(con);
    }
    
    @Override
    public Optional<ConocimientosAptitudes> findById(Long id) {
        return conapRepo.findById(id);
    }
  
    
}
