/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Localidad;
import com.pherrera.portfolio.repository.LocalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pherrera
 */
@Service
public class LocalidadService implements InterfaceLocalidadService{
         @Autowired
    public LocalidadRepository locRepo;

    @Override
    public List<Localidad> verLocalidad() {
        return locRepo.findAll();
    }

    @Override
    public void crearLocalidad(Localidad loc) {
        locRepo.save(loc);
    }

    @Override
    public void borrarLocalidad(Long id) {
        locRepo.deleteById(id);
    }

    @Override
    public Localidad buscarLocalidad(Long id) {
        return locRepo.findById(id).orElse(null);
    }
        @Override
    public void editarLocalidad(Localidad loc) {
        locRepo.save(loc);
    }
}
