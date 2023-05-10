/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Cursos;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceCursosService {
    public List<Cursos> verCursos();
    public void crearCursos (Cursos cur);
    public void borrarCursos (Long id);
    public Cursos buscarCursos (Long id);
    public void editarCursos (Cursos cur);
    
}
