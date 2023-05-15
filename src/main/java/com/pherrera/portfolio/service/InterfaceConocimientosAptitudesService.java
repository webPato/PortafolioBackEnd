/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.ConocimientosAptitudes;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author pherrera
 */
public interface InterfaceConocimientosAptitudesService {
    public List<ConocimientosAptitudes> verConocimientosAptitudes();
    public void crearConocimientosAptitudes (ConocimientosAptitudes capt);
    public void borrarConocimientosAptitudes (Long id);
    public ConocimientosAptitudes buscarConocimientosAptitudes (Long id);
    public void editarConocimientosAptitudes (ConocimientosAptitudes con);  
    public Optional<ConocimientosAptitudes> findById(Long id);
    
    
}
