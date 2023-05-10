/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Profesion;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceProfesionService {
        public List<Profesion> verProfesion();
    public void crearProfesion (Profesion prof);
    public void borrarProfesion (Long id);
    public Profesion buscarProfesion (Long id);
    public void editarProfesion (Profesion prof);
}
