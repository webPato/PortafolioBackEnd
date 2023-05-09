/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.AcercaDe;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceAcercadeService {
    
    public List<AcercaDe> verAcercaDe();
    public void crearAcercaDe (AcercaDe acd);
    public void borrarAcercaDe (Long id);
    public AcercaDe buscarAcercaDe (Long id);
    public void editarAcercaDe(AcercaDe acd);
    
    
}
