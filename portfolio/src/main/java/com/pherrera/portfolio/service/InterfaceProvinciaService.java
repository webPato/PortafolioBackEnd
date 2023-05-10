/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Provincia;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceProvinciaService {
    public List<Provincia> verProvincia();
    public void crearProvincia (Provincia pro);
    public void borrarProvincia (Long id);
    public Provincia buscarProvincia (Long id);
    public void editarProvincia (Provincia prov);
}
